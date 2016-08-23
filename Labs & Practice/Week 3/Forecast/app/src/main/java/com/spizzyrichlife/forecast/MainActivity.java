package com.spizzyrichlife.forecast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

//    Requirements
//
//  [X]  Lists the forecast, backed by a list of Forecast objects
//  [X]  The app shows at least 5 forecasts
//  [X]  Each list item has three text views: day, high, and low
//  [ ]  Each list item contains a small image describing the weather

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list_view);

        ArrayList<Forecast> forecastList = new ArrayList<>();
        forecastList.add(new Forecast("Monday", "99", "75"));
        forecastList.add(new Forecast("Tuesday", "95", "80"));
        forecastList.add(new Forecast("Wednseday", "90", "85"));
        forecastList.add(new Forecast("Thursday", "85", "80"));
        forecastList.add(new Forecast("Friday","65","64"));

        CustomAdapter adapter = new CustomAdapter(this, forecastList);
        listView.setAdapter(adapter);
    }
}
