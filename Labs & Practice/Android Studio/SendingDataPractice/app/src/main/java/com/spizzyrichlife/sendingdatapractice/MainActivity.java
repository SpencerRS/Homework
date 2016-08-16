package com.spizzyrichlife.sendingdatapractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button mrButton;
    EditText mrEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mrButton = (Button) findViewById(R.id.mrButton);
        mrEditText = (EditText) findViewById(R.id.mrEditText);

        mrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = mrEditText.getText().toString();
                Intent mrIntent = new Intent(MainActivity.this, EchoActivity.class);

                mrIntent.putExtra("input", input);
                startActivity(mrIntent);
            }
        });
    }

}
