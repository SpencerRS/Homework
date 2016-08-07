/**
 * Created by SpizzyRich on 8/4/16.
 */

//Requirements

//Your work must:
//
//  [X]   Have a main menu with options to enter "play" or "history":
// I also added quit.
//  [X]   If the user enters "play", they should be able to play Rock Paper Scissors against the computer
//  [X]   If the user enters "history", the program should display previous game history
//  [X]   Handle invalid user input
//  [X]   Use Arrays or ArrayLists to store game history
//Bonus:
//  [X]   Handle incorrect capitalization of otherwise valid user input (rock, Rock, RoCk, ROCK, etc.)
//  [0]   Ultimate Rock, Paper, Scissors instead of regular RPS.

// Basic RPS has 3 inputs; Ultimate RPS has 15
// Basic RPS inputs = Rock, Paper and Scissors
//Ultimate RPS inputs = Rock, Gun, Lightning, Devil, Dragon, Water, Air, Paper, Sponge, Wolf, Tree, Human, Snake, Scissors and Fire
//Both Basic and Ultimate output either "You won!" "You lost :(" or "It was a tie!"

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        System.out.println("Ultimate Rock, Paper, Scissors");
        System.out.println("Developed by $pizzy Ri¢h");
// Make recursive
        ask();
    }

    public static void rps() {

        System.out.println("The battle is about to begin.\n Select your weapon...");
        System.out.println("Type Rock, Paper or Scissors");
//        System.out.println("Welcome to ULTIMATE ROCK, PAPER, SCISSORS! Select your weapon...");
//        System.out.println("Type Rock, Gun, Lightning, Devil, Dragon, Water, Air, Paper, Sponge, Wolf, Tree, Human, Snake, Scissors or Fire");
// Assign weapon numbers
        int rock = 0;
        int paper = 1;
        int scissors = 2;
//        int rock = 0;
//        int gun = 1;
//        int lightning = 2;
//        int devil = 3;
//        int dragon = 4;
//        int water = 5;
//        int air = 6;
//        int paper = 7;
//        int sponge = 8;
//        int wolf = 9;
//        int tree = 10;
//        int human = 11;
//        int snake = 12;
//        int scissors = 13;
//        int fire = 14;

// Use an int to track who won
        int winner;


// Create a random generator and user weapon variable
        Random rando = new Random();
        int userWeapon = 0;

// Capture user choice, read it, lower case it and convert to weapon #
        String userChoice = grabInput();
        String lUserChoice = userChoice.toLowerCase();
        if (lUserChoice.equals("rock")) {
            userWeapon = rock;
        } else if (lUserChoice.equals("paper")) {
            userWeapon = paper;
        } else if (lUserChoice.equals("scissors")) {
            userWeapon = scissors;
        } else {
            System.out.println("You want to fight with what??? \n Let's try that again...");
            rps();
        }
// Capture computer choice; 3 for regular, 15 for ultimate
        int compWeapon = rando.nextInt(3);
//        String compWeapon=rando.nextInt(15);

// Check for ties
//        if (userWeapon == compWeapon) {System.out.println("It was a tie!");}
        if (userWeapon == 0) { // Rock
            if (compWeapon == 0) { //vs Rock
                System.out.println("It's a tie! Rock vs rock!");
                System.out.println("Go again!");
                rps();
            }
            if (compWeapon == 1) { // vs Paper
                System.out.println("You lose! Rock vs paper!");
                winner = 0;
                logHistory(0, 1, 0);
            }
            if (compWeapon == 2) { // vs Scissors
                System.out.println("You win! Rock vs scissors!");
                winner = 1;
                logHistory(0, 2, 1);
            }
        }
        if (userWeapon == 1) { // Paper
            if (compWeapon == 0) { //vs Rock
                System.out.println("You win! Paper vs rock!");
                winner = 1;
                logHistory(1, 0, 1);
            }
            if (compWeapon == 1) { // vs Paper
                System.out.println("It's a tie! Paper vs paper!");
                System.out.println("Go again!");
                rps();
            }
            if (compWeapon == 2) { // vs Scissors
                System.out.println("You lose! Paper vs scissors!");
                winner = 0;
                logHistory(1, 2, 0);
            }
        }
        if (userWeapon == 2) { // Scissors
            if (compWeapon == 0) { //vs Rock
                System.out.println("You lose! Scissors vs rock!");
                winner = 0;
                logHistory(2, 0, 0);
            }
            if (compWeapon == 1) { // vs Paper
                System.out.println("You win! Scissors vs paper!");
                winner = 1;
                logHistory(2, 1, 1);

            }
            if (compWeapon == 2) { // vs Scissors
                System.out.println("It's a tie! Scissors vs scissors!");
                System.out.println("Go again!");
                rps();
            }
        }
        ask();
    }


    //Grab user choice
    public static String grabInput() {
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

//    public static String results(String mUserChoice, String mCompChoice, String mWinner, String mTimeStamp) {
//Round round = new Round();
//    }

    // Seek player input to Play, History or Quit
    public static void ask() {
        // Print out initial prompt
        System.out.println("Type Play to play Rock, Paper, Scissors!");
//        System.out.println("Type Play to play Ultimate Rock, Paper, Scissors");
        System.out.println("Or type History to see the history of your 5 most recent battles!");
        System.out.println("You may also type Quit to quit...");
        String userChoice = grabInput();
        String lUserChoice = userChoice.toLowerCase();
// TODO: Look into switch statements
        if (lUserChoice.equals("play")) {
            rps();
        } else if (lUserChoice.equals("history")) {
// TODO [INSERT HISTORY METHOD]
            for (int i = 0; i < history.size(); i += 3) {
                int pChoice = history.get(i);
                int cChoice = history.get(i + 1);
                int winner = history.get(i + 2);
                String player;
                String comp;
                String won;
                if (pChoice == 0) {
                    player = "rock ";
                } else if (pChoice == 1) {
                    player = "paper ";
                } else {
                    player = "scissors ";
                }
                if (cChoice == 0) {
                    comp = "rock ";
                } else if (cChoice == 1) {
                    comp = "paper ";
                } else {
                    comp = "scissors ";
                }
                if (winner == 0) {
                    won = "The computer ";
                } else {
                    won = "You ";
                }

                System.out.println(won + "won when you used " + player + "against the computer's " + comp);
                ask();
            }
        } else if (lUserChoice.equals("quit")) {
            askAgain();
        } else {
            System.out.println("You want to what? \n Let's try this again...");
            ask();
        }
    }

    //Ask again
    public static void askAgain() {
        System.out.println("Are you sure? Type Yes or no.");
        String userChoice = grabInput();
        String lUserChoice = userChoice.toLowerCase();
        if (lUserChoice == "yes") {
            System.exit(0);
        } else if (lUserChoice == "no") {
            ask();
        } else {
            System.out.println("Check your spelling and try again.");
        }
    }

    public static ArrayList<Integer> history = new ArrayList();

    public static void logHistory(int playerWeapon, int compWeapon, int winner) {
        history.add(playerWeapon);
        history.add(compWeapon);
        history.add(winner);
    }

}
