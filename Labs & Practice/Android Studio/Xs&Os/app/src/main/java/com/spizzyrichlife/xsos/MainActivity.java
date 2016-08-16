package com.spizzyrichlife.xsos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

//Requirements
//
//        Your app must:
//  [X]   Allow players to mark 9 squares with an X or O when they touch them.
//  [X]   Order the players moves into turns, so one player always plays X and the other O.
//  [X]   Create the game logic that is able to determine a win.
//  [X]   Create the game logic that is able to determine a draw.
//  [X]   Announce the result of the game when it is finished.
//
//        Bonus:
//  [X]   Add the functionality to refresh the board and play again.
//  [ ]   Create an Activity that allows the players to enter their names.
//  [ ]   Use the entered names to announce who's turn it is each time.
//  [ ]   Announce the name of the winner.
//  [ ]   Find creative ways to improve the UX of your game.

public class MainActivity extends AppCompatActivity {
    TextView b1;
    TextView b2;
    TextView b3;
    TextView b4;
    TextView b5;
    TextView b6;
    TextView b7;
    TextView b8;
    TextView b9;

    public int turn = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (TextView) findViewById(R.id.boxOne);
        b2 = (TextView) findViewById(R.id.boxTwo);
        b3 = (TextView) findViewById(R.id.boxThree);
        b4 = (TextView) findViewById(R.id.boxFour);
        b5 = (TextView) findViewById(R.id.boxFive);
        b6 = (TextView) findViewById(R.id.boxSix);
        b7 = (TextView) findViewById(R.id.boxSeven);
        b8 = (TextView) findViewById(R.id.boxEight);
        b9 = (TextView) findViewById(R.id.boxNine);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                whenClick(b1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                whenClick(b2);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                whenClick(b3);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                whenClick(b4);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                whenClick(b5);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                whenClick(b6);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                whenClick(b7);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                whenClick(b8);
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                whenClick(b9);
            }
        });

    }

    public void setWin() {
        b1.setText("Y");
        b2.setText("O");
        b3.setText("U");
        b4.setText("W");
        b5.setText("I");
        b6.setText("N");
        b7.setText("M");
        b8.setText("R.");
        if (turn == 1) {
            b9.setText("O");
        } else {
            b9.setText("X");
        }
    }

    public void whenClick(TextView button) {
        if (button.getText().toString().equals("X")) {
            Toast.makeText(MainActivity.this, "You must pick an empty square!", Toast.LENGTH_LONG).show();
        } else if (button.getText().toString().equals("O")) {
            Toast.makeText(MainActivity.this, "You must pick an empty square!", Toast.LENGTH_LONG).show();
        } else if (b1.getText().toString().equals("Y")) {
            wipeBoard();
        } else if (turn == 1) {
            button.setText("X");
            turn = 2;
        } else {
            button.setText("O");
            turn = 1;
        }
        checkForWin();
        checkForTie();
    }

    public void wipeBoard() {
        b1.setText("1");
        b2.setText("2");
        b3.setText("3");
        b4.setText("4");
        b5.setText("5");
        b6.setText("6");
        b7.setText("7");
        b8.setText("8");
        b9.setText("9");
    }

    public void checkForWin() {
        if (b1.getText().toString().equals(b2.getText().toString()) && b1.getText().toString().equals(b3.getText().toString())) { //TOP ROW WINS
            setWin();
        } else if (b4.getText().toString().equals(b5.getText().toString()) && b4.getText().toString().equals(b6.getText().toString())) { //MID ROW WINS
            setWin();
        }
        if (b7.getText().toString().equals(b8.getText().toString()) && b7.getText().toString().equals(b9.getText().toString())) { //BOTTOM ROW WINS
            setWin();
        } else if (b1.getText().toString().equals(b4.getText().toString()) && b1.getText().toString().equals(b7.getText().toString())) { //LEFT COLUMN WINS
            setWin();
        } else if (b2.getText().toString().equals(b5.getText().toString()) && b2.getText().toString().equals(b8.getText().toString())) { //MID COLUMN WINS
            setWin();
        } else if (b3.getText().toString().equals(b6.getText().toString()) && b3.getText().toString().equals(b9.getText().toString())) { //RIGHT COLUMN WINS
            setWin();
        } else if (b1.getText().toString().equals(b5.getText().toString()) && b1.getText().toString().equals(b9.getText().toString())) { //DIAGONAL 1 WINS
            setWin();
        } else if (b3.getText().toString().equals(b5.getText().toString()) && b3.getText().toString().equals(b7.getText().toString())) { //DIAGONAL 2 WINS
            setWin();
        }
    }

    public void checkForTie() {
        if ((stringBox(b1).equals("X") || stringBox(b1).equals("O")) && (stringBox(b2).equals("X") || stringBox(b2).equals("O")) && (stringBox(b3).equals("X") || stringBox(b3).equals("O")) && (stringBox(b4).equals("X") || stringBox(b4).equals("O")) && (stringBox(b5).equals("X") || stringBox(b5).equals("O")) && (stringBox(b6).equals("X") || stringBox(b6).equals("O")) && (stringBox(b7).equals("X") || stringBox(b7).equals("O")) && (stringBox(b8).equals("X") || stringBox(b8).equals("O")) && (stringBox(b9).equals("X") || stringBox(b9).equals("O"))) {
            Toast.makeText(MainActivity.this, "TIE! Resetting...", Toast.LENGTH_LONG).show();
            wipeBoard();
        }
    }

    public String stringBox(TextView bX) {
        return bX.getText().toString();
    }
}

