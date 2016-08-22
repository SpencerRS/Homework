package ly.generalassemb.drewmahrt.cursordemo;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getCanonicalName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SQLiteDatabase db;

        db = openOrCreateDatabase(
                "TestingData.db"
                , SQLiteDatabase.CREATE_IF_NECESSARY
                , null
        );
        db.setVersion(1);
        db.setLocale(Locale.getDefault());

        String[] countryNames = new String[]{"Cananda", "USA", "Mexico"};
        int[] populations = new int[]{35, 318, 125};
        db.execSQL("CREATE TABLE IF NOT EXISTS tbl_countries (country_name VARCHAR, population VARCHAR);");
        for (int i = 0; i < countryNames.length; i++) {
            db.execSQL("INSERT INTO tbl_countries Values ('" + countryNames[i] + "', '" + populations[i] + "');");
        }
        // save info from queary to cursor
        Cursor cursor = db.query("tbl_countries", new String[]{"country_name"}, "population = ? and country_name = ?", new String[] {"35", "Canada"}, null, null, null);

//        Log.d ("tag", "cursor count: " + cursor.getCount());

//        Log.d("tag", "cursor column count: " + cursor.getColumnCount());

//        Log.d("tag", "cursor columns: " + Arrays.toString(cursor.getColumnName()));

//        cursor.moveToFirst();
//
//        while (cursor.isAfterLast() == false){
//            Log.d("tag","DB result " +cursor.getString(0));
//            cursor.moveToNext();
        while (cursor.moveToNext()){
            Log.d("tag","DB result " +
                    cursor.getColumnIndex("country_name")
                    + " " +
                    cursor.getColumnIndex("population"));
        }

        // close to make sure you save space
        cursor.close();
    }
}
