package com.spizzyrichlife.sendingdatapractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class EchoActivity extends AppCompatActivity {
    TextView mrTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_echo);
        Intent mrIntent = getIntent();
        mrTextView = (TextView) findViewById(R.id.textView);
        String mrOutput = mrIntent.getStringExtra("input");
        mrTextView.setText(mrOutput);

    }
}
