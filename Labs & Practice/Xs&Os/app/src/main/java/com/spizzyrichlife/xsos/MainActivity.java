package com.spizzyrichlife.xsos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

//Requirements
//
//        Your app must:
//  [ ]   Allow players to mark 9 squares with an X or O when they touch them.
//  [ ]   Order the players moves into turns, so one player always plays X and the other O.
//  [ ]   Create the game logic that is able to determine a win.
//  [ ]   Create the game logic that is able to determine a draw.
//  [ ]   Announce the the result of the game when it is finished.
//
//        Bonus:
//  [ ]   Add the functionality to refresh the board and play again.
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
//      TODO: use wipeBoard to allow recursion and automate replay
//       wipeBoard();
//        public void wipeBoard() {
//            b1.setText("   ");
//            b2.setText("   ");
//            b3.setText("   ");
//            b4.setText("   ");
//            b5.setText("   ");
//            b6.setText("   ");
//            b7.setText("   ");
//            b8.setText("   ");
//            b9.setText("   ");
//        }
        //TODO: Refactor to use boolean? Instead of turn as an int. (Like GABE)
        // Create 9 clickable buttons
        // Make the buttons change the text in the view to either an X or an O depending on turn
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn == 1) {
                    b1.setText("X");
                    turn = 2;
                } else {
                    b1.setText("O");
                    turn = 1;
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn == 1) {
                    b2.setText("X");
                    turn = 2;
                } else {
                    b2.setText("O");
                    turn = 1;
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn == 1) {
                    b3.setText("X");
                    turn = 2;
                } else {
                    b3.setText("O");
                    turn = 1;
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn == 1) {
                    b4.setText("X");
                    turn = 2;
                } else {
                    b4.setText("O");
                    turn = 1;
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn == 1) {
                    b5.setText("X");
                    turn = 2;
                } else {
                    b5.setText("O");
                    turn = 1;
                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn == 1) {
                    b6.setText("X");
                    turn = 2;
                } else {
                    b6.setText("O");
                    turn = 1;
                }
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn == 1) {
                    b7.setText("X");
                    turn = 2;
                } else {
                    b7.setText("O");
                    turn = 1;
                }
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn == 1) {
                    b8.setText("X");
                    turn = 2;
                } else {
                    b8.setText("O");
                    turn = 1;
                }
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn == 1) {
                    b9.setText("X");
                    turn = 2;
                } else {
                    b9.setText("O");
                    turn = 1;
                }
            }
        });
        if(b1.getText()== b2.getText() && b1.getText()==b3.getText()){ //TOP ROW WINS

        }
        if(b4.getText()== b5.getText() && b4.getText()==b6.getText()){ //MID ROW WINS

        }
        if(b7.getText()== b8.getText() && b7.getText()==b9.getText()){ //BOTTOM ROW WINS

        }
        if(b1.getText()== b4.getText() && b1.getText()==b7.getText()){ //LEFT COLUMN WINS

        }
        if(b2.getText()== b5.getText() && b2.getText()==b8.getText()){ //MID COLUMN WINS

        }
        if(b3.getText()== b6.getText() && b3.getText()==b9.getText()){ //RIGHT COLUMN WINS

        }
        if(b1.getText()== b5.getText() && b1.getText()==b9.getText()){ //DIAGONAL 1 WINS

        }
        if(b3.getText()== b5.getText() && b3.getText()==b7.getText()){ //DIAGONAL 2 WINS

        }
    }

    // HOW TO: Create a button that you can click
//        Button button= (Button) findViewById(R.id.standingsButton);
//        button.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this,StandingsActivity.class));
//            }
//        });

}

