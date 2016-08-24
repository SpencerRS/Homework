package ly.generalassemb.drewmahrt.cursoradapterdemo;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import ly.generalassemb.drewmahrt.cursoradapterdemo.setup.DBAssetHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Ignore the two lines below, they are for setup
        DBAssetHelper dbSetup = new DBAssetHelper(MainActivity.this);
        dbSetup.getReadableDatabase();

        //Get cursor
        Cursor cursor = ExampleSQLiteOpenHelper.getInstance(MainActivity.this).getExampleList();

        //Option one: Custom Cursor Adapter
        CursorAdapter cursorAdapter = new CursorAdapter(MainActivity.this,cursor,0) {
            @Override
            public View newView(Context context, Cursor cursor, ViewGroup parent) {
                return LayoutInflater.from(context).inflate(R.layout.list_item_layout,parent,false);
            }

            @Override
            public void bindView(View view, Context context, Cursor cursor) {
                TextView textView = (TextView)view.findViewById(R.id.name_text_view);
                TextView descriptionTextView = (TextView)view.findViewById(R.id.description_text_view);

                textView.setText(cursor.getString(cursor.getColumnIndex(ExampleSQLiteOpenHelper.COL_ITEM_NAME)));
                descriptionTextView.setText(cursor.getString(cursor.getColumnIndex(ExampleSQLiteOpenHelper.COL_ITEM_DESCRIPTION)));
            }
        };

        //Option Two: Simple Cursor Adapter
        String[] columns = new String[]{ExampleSQLiteOpenHelper.COL_ITEM_NAME,ExampleSQLiteOpenHelper.COL_ITEM_DESCRIPTION};
        int[] viewNames = new int[]{R.id.name_text_view,R.id.description_text_view};
        CursorAdapter simpleCursorAdapter = new SimpleCursorAdapter(
                MainActivity.this,
                R.layout.list_item_layout,
                cursor,
                columns,
                viewNames,
                0
        );

        //Set adapter
        ListView listView = (ListView)findViewById(R.id.example_list_view);

        //Option one: Custom Cursor Adapter
//        listView.setAdapter(cursorAdapter);

        //Option Two: Simple Cursor Adapter
        listView.setAdapter(simpleCursorAdapter);
    }
}
