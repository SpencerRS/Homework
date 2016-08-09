package com.effoff.spizzyrich.practicing;

import android.content.DialogInterface;
import android.support.v7.app.AlertController;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mrButton = (Button) findViewById(R.id.mrButton);
        View.OnClickListener clickButtonJr = new View.OnClickListener() {
            @Override
            public void viewTextJr (View v){
                
            }
        }
        TextView mrTextView = (TextView) findViewById(R.id.mrViewText);
    }
}
