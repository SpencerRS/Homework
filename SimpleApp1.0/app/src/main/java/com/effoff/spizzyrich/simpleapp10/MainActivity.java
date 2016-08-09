package com.effoff.spizzyrich.simpleapp10;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.graphics.Color.BLUE;

public class MainActivity extends AppCompatActivity {


    Button mrTextButton;
    Button mrGreenButton;
    Button mrBlueButton;
    Button mrRedButton;
    TextView mrTextOutput;
    EditText mrsTextInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mrTextButton = (Button) findViewById(R.id.textButton);
        mrBlueButton = (Button) findViewById(R.id.blueButton);
        mrGreenButton = (Button) findViewById(R.id.greenButton);
        mrRedButton = (Button) findViewById(R.id.redButton);
        mrTextOutput = (TextView) findViewById(R.id.textView);
        mrsTextInput = (EditText) findViewById(R.id.editText);

        mrBlueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mrTextOutput.setText("Blue");
                mrTextOutput.setTextColor(BLUE);
            }
        });
        mrRedButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mrTextOutput.setText("Red");
                mrTextOutput.setTextColor(Color.RED);
            }
        });
        mrGreenButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mrTextOutput.setText("Green");
                mrTextOutput.setTextColor(Color.GREEN);
            }
        });



    }
}
