//package com.spizzyrichlife.xsos;
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.TextView;
//
///**
// * Created by SpizzyRich on 8/15/16.
// */
//public class FirstPassSourceCode {
//    TextView b1;
//    TextView b2;
//    TextView b3;
//    TextView b4;
//    TextView b5;
//    TextView b6;
//    TextView b7;
//    TextView b8;
//    TextView b9;
//
//    public int turn = 1;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        b1 = (TextView) findViewById(R.id.boxOne);
//        b2 = (TextView) findViewById(R.id.boxTwo);
//        b3 = (TextView) findViewById(R.id.boxThree);
//        b4 = (TextView) findViewById(R.id.boxFour);
//        b5 = (TextView) findViewById(R.id.boxFive);
//        b6 = (TextView) findViewById(R.id.boxSix);
//        b7 = (TextView) findViewById(R.id.boxSeven);
//        b8 = (TextView) findViewById(R.id.boxEight);
//        b9 = (TextView) findViewById(R.id.boxNine);
//
//        //TODO: Refactor to use boolean? Instead of turn as an int. (Like GABE)
//        // Create 9 clickable buttons
//        // Make the buttons change the text in the view to either an X or an O depending on turn
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (turn == 1) {
//                    b1.setText("X");
//                    turn = 2;
//                } else {
//                    b1.setText("O");
//                    turn = 1;
//                }
//                checkForWin();
//            }
//        });
//        b2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (turn == 1) {
//                    b2.setText("X");
//                    turn = 2;
//                } else {
//                    b2.setText("O");
//                    turn = 1;
//                }
//                checkForWin();
//            }
//        });
//
//        b3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (turn == 1) {
//                    b3.setText("X");
//                    turn = 2;
//                } else {
//                    b3.setText("O");
//                    turn = 1;
//                }
//                checkForWin();
//            }
//        });
//        b4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (turn == 1) {
//                    b4.setText("X");
//                    turn = 2;
//                } else {
//                    b4.setText("O");
//                    turn = 1;
//                }
//                checkForWin();
//            }
//        });
//
//        b5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (turn == 1) {
//                    b5.setText("X");
//                    turn = 2;
//                } else {
//                    b5.setText("O");
//                    turn = 1;
//                }
//                checkForWin();
//            }
//        });
//
//        b6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (turn == 1) {
//                    b6.setText("X");
//                    turn = 2;
//                } else {
//                    b6.setText("O");
//                    turn = 1;
//                }
//                checkForWin();
//            }
//        });
//
//        b7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (turn == 1) {
//                    b7.setText("X");
//                    turn = 2;
//                } else {
//                    b7.setText("O");
//                    turn = 1;
//                }
//                checkForWin();
//            }
//        });
//
//        b8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (turn == 1) {
//                    b8.setText("X");
//                    turn = 2;
//                } else {
//                    b8.setText("O");
//                    turn = 1;
//                }
//                checkForWin();
//            }
//        });
//
//        b9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (turn == 1) {
//                    b9.setText("X");
//                    turn = 2;
//                } else {
//                    b9.setText("O");
//                    turn = 1;
//                }
//                checkForWin();
//            }
//        });
//    }
//
//    public void checkForWin() {
//        // TODO: Add ability to detect DRAWS
//        //TODO: Detect WINNER
//        // TODO: Detect a WIN
//        if (b1.getText().toString().equals(b2.getText().toString()) && b1.getText().toString().equals(b3.getText().toString())) { //TOP ROW WINS
//            b1.setText("Y");
//            b2.setText("O");
//            b3.setText("U");
//            b4.setText("W");
//            b5.setText("I");
//            b6.setText("N");
//            b7.setText("M");
//            b8.setText("R.");
//            if (turn == 1) {
//                b9.setText("O");
//            } else {
//                b9.setText("X");
//            }
//        }
//        if (b4.getText().toString().equals(b5.getText().toString()) && b4.getText().toString().equals(b6.getText().toString())) { //MID ROW WINS
//            b1.setText("Y");
//            b2.setText("O");
//            b3.setText("U");
//            b4.setText("W");
//            b5.setText("I");
//            b6.setText("N");
//            b7.setText("M");
//            b8.setText("R.");
//            if (turn == 1) {
//                b9.setText("O");
//            } else {
//                b9.setText("X");
//            }
//        }
//        if (b7.getText().toString().equals(b8.getText().toString()) && b7.getText().toString().equals(b9.getText().toString())) { //BOTTOM ROW WINS
//            b1.setText("Y");
//            b2.setText("O");
//            b3.setText("U");
//            b4.setText("W");
//            b5.setText("I");
//            b6.setText("N");
//            b7.setText("M");
//            b8.setText("R.");
//            if (turn == 1) {
//                b9.setText("O");
//            } else {
//                b9.setText("X");
//            }
//        }
//        if (b1.getText().toString().equals(b4.getText().toString()) && b1.getText().toString().equals(b7.getText().toString())) { //LEFT COLUMN WINS
//            b1.setText("Y");
//            b2.setText("O");
//            b3.setText("U");
//            b4.setText("W");
//            b5.setText("I");
//            b6.setText("N");
//            b7.setText("M");
//            b8.setText("R.");
//            if (turn == 1) {
//                b9.setText("O");
//            } else {
//                b9.setText("X");
//            }
//        }
//        if (b2.getText().toString().equals(b5.getText().toString()) && b2.getText().toString().equals(b8.getText().toString())) { //MID COLUMN WINS
//            b1.setText("Y");
//            b2.setText("O");
//            b3.setText("U");
//            b4.setText("W");
//            b5.setText("I");
//            b6.setText("N");
//            b7.setText("M");
//            b8.setText("R.");
//            if (turn == 1) {
//                b9.setText("O");
//            } else {
//                b9.setText("X");
//            }
//        }
//        if (b3.getText().toString().equals(b6.getText().toString()) && b3.getText().toString().equals(b9.getText().toString())) { //RIGHT COLUMN WINS
//            b1.setText("Y");
//            b2.setText("O");
//            b3.setText("U");
//            b4.setText("W");
//            b5.setText("I");
//            b6.setText("N");
//            b7.setText("M");
//            b8.setText("R.");
//            if (turn == 1) {
//                b9.setText("O");
//            } else {
//                b9.setText("X");
//            }
//        }
//        if (b1.getText().toString().equals(b5.getText().toString()) && b1.getText().toString().equals(b9.getText().toString())) { //DIAGONAL 1 WINS
//            b1.setText("Y");
//            b2.setText("O");
//            b3.setText("U");
//            b4.setText("W");
//            b5.setText("I");
//            b6.setText("N");
//            b7.setText("M");
//            b8.setText("R.");
//            if (turn == 1) {
//                b9.setText("O");
//            } else {
//                b9.setText("X");
//            }
//        }
//        if (b3.getText().toString().equals(b5.getText().toString()) && b3.getText().toString().equals(b7.getText().toString())) { //DIAGONAL 2 WINS
//            b1.setText("Y");
//            b2.setText("O");
//            b3.setText("U");
//            b4.setText("W");
//            b5.setText("I");
//            b6.setText("N");
//            b7.setText("M");
//            b8.setText("R.");
//            if (turn == 1) {
//                b9.setText("O");
//            } else {
//                b9.setText("X");
//            }
//        }
//    }
////    TODO: use wipeBoard to allow recursion and automate replay
////       wipeBoard();
////        public void wipeBoard() {
////            b1.setText("   ");
////            b2.setText("   ");
////            b3.setText("   ");
////            b4.setText("   ");
////            b5.setText("   ");
////            b6.setText("   ");
////            b7.setText("   ");
////            b8.setText("   ");
////            b9.setText("   ");
////        }
//
//    // HOW TO: Create a button that you can click
////        Button button= (Button) findViewById(R.id.standingsButton);
////        button.setOnClickListener(new View.OnClickListener() {
////            public void onClick(View v) {
////                startActivity(new Intent(MainActivity.this,StandingsActivity.class));
////            }
////        });
//
//}
//
//
//}
