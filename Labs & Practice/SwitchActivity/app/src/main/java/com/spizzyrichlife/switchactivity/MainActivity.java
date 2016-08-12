package com.spizzyrichlife.switchactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button mrButton;
    private static final String TAG = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       = mrButton = (Button) findViewById(R.id.mrButton);
        mrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                Log.d(TAG, "Jump on my Gooble Box, start the light show!");
                startActivity(intent);
                Toast.makeText(MainActivity.this, "JON was a 3 letter word.", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
