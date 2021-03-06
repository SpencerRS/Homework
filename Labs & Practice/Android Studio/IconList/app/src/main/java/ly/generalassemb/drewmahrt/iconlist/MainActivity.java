package ly.generalassemb.drewmahrt.iconlist;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import ly.generalassemb.drewmahrt.iconlist.setup.DBAssetHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Ignore the two lines below
        DBAssetHelper dbAssetHelper = new DBAssetHelper(MainActivity.this);
        dbAssetHelper.getReadableDatabase();

        Cursor cursor = IconSQLiteOpenHelper.getInstance(MainActivity.this).getIconList();
        CursorAdapter myCursorAdapter = new CursorAdapter(MainActivity.this,cursor,0) {
            @Override
            public View newView(Context context, Cursor cursor, ViewGroup parent) {
                return LayoutInflater.from(context).inflate(R.layout.icon_list_item,parent,false);
            }

            @Override
            public void bindView(View view, Context context, Cursor cursor) {
                TextView textView = (TextView)view.findViewById(R.id.icon_name_text_view);
                ImageView imageView = (ImageView)view.findViewById(R.id.icon_image_view);


                textView.setText(cursor.getString(cursor.getColumnIndex(IconSQLiteOpenHelper.COL_ICON_NAME)));
                imageView.setImageResource(getDrawableValue(textView.getText().toString()));
            }
        };

        ListView listView = (ListView)findViewById(R.id.icon_list_view);
        listView.setAdapter(myCursorAdapter);

    }

    private int getDrawableValue(String icon){
        switch(icon){
            case "search":
                return android.R.drawable.ic_menu_search;
            case "add":
                return android.R.drawable.ic_menu_add;
            case "upload":
                return android.R.drawable.ic_menu_upload;
            case "play":
                return android.R.drawable.ic_media_play;
            default:
                return 0;
        }
    }
