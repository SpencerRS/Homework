package com.gcraven.sqliteopenhelperdemo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by g on 8/23/16.
 */
//One single class that handles everything you might want to do with a database
public class DatabaseHelper extends SQLiteOpenHelper {

// ALL_CAPS_FORMAT makes the lowercase stand out (Final variables are uppercase)
// ALL_CAPS_MEMBER_VARIABLES allow details to be changed throughout by changing in one place (like resource values)
    public static final int DATABASE_VERSION = 2;
    public static final String DATABASE_NAME = "games.db";
    public static final String GAME_TABLE_NAME = "games";
// _id is a requisite in this. Should always be the first column in the table (primary key)
    public static final String GAME_COLUMN_ID = "_id";
    public static final String GAME_COLUMN_NAME = "name";
    public static final String GAME_COLUMN_YEAR = "year";
// Stringing a sentence to create a table in SQL
    public static final String SQL_CREATE_GAME_TABLE =
            "CREATE TABLE "+GAME_TABLE_NAME+" " +
            "( "+GAME_COLUMN_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, " +
            GAME_COLUMN_NAME+" TEXT, " +
            GAME_COLUMN_YEAR+" TEXT)";
    public static final String SQL_DROP_GAME_TABLE = "DROP TABLE IF EXISTS "+GAME_TABLE_NAME;

// Constructor
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

// CREATE.r.u.d
// Uses established stringed sentance to create a new table.
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQL_CREATE_GAME_TABLE);
    }
// wipes the database/file to start fresh
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(SQL_DROP_GAME_TABLE);
        onCreate(sqLiteDatabase);
    }
// Constructor to add a row to the table
    public int insert(String name, String year){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(GAME_COLUMN_NAME, name);
        values.put(GAME_COLUMN_YEAR, year);
        long id = db.insert(GAME_TABLE_NAME, null, values);
        return ((int)id);
    }
// c.READ.u.d
// Creates a new object based on a custom class
    public Game getGame(int id){
        SQLiteDatabase db = getReadableDatabase();

// Which columns we want to look at in the below Query
        String[] projection = new String[]{GAME_COLUMN_ID, GAME_COLUMN_NAME, GAME_COLUMN_YEAR};

// ? is a placeholder for the values outlined in selectionArgs
        String selection = GAME_COLUMN_ID + " = ?";

        String[] selectionArgs = new String[]{String.valueOf(id)};

// A cursor is a search RESULT. This cursor uses query and our previous variables to look at certain things.
        Cursor cursor = db.query(GAME_TABLE_NAME, projection, selection, selectionArgs, null, null, null);

        cursor.moveToFirst();

// Using the saves RESULT, grabbing a String version of the values we want
        String name = cursor.getString(cursor.getColumnIndex(GAME_COLUMN_NAME));
        String year = cursor.getString(cursor.getColumnIndex(GAME_COLUMN_YEAR));

// Using the Game class, creating an object from a value in our table.
        return new Game(id, name, year);
    }

// c.r.u.DELETE
    public void delete(int id){
        SQLiteDatabase db = getWritableDatabase();

        String selection = GAME_COLUMN_ID + " = ?";

        String[] selectionArgs = new String[]{String.valueOf(id)};

        db.delete(GAME_TABLE_NAME, selection, selectionArgs);
    }
}
