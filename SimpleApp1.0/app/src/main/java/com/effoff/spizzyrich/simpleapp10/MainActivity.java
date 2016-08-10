package com.effoff.spizzyrich.simpleapp10;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
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
    Button mrActivitySwitch;

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
                mrTextOutput.setTextColor(BLUE);
                Editable input = mrsTextInput.getText();
                mrTextOutput.setText(input);
            }
        });
        mrRedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mrTextOutput.setTextColor(Color.RED);
                Editable input = mrsTextInput.getText();
                mrTextOutput.setText(input);
            }
        });
        mrGreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mrTextOutput.setTextColor(Color.GREEN);
                Editable input = mrsTextInput.getText();
                mrTextOutput.setText(input);
            }
        });

        mrTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable input = mrsTextInput.getText();
                mrTextOutput.setText(input);
            }
        });
        mrActivitySwitch = (Button) findViewById(R.id.button);

        mrActivitySwitch.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                StartActivity(intent);

            }
        });
    }
}
