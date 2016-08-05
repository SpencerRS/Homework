/**
 * Created by SpizzyRich on 8/4/16.
 */

//Requirements

//Your work must:
//
//  [X]   Have a main menu with options to enter "play" or "history":
//  [X]   If the user enters "play", they should be able to play Rock Paper Scissors against the computer
//  [0]   If the user enters "history", the program should display previous game history
//  [0]   Handle invalid user input
//  [0]   Use Arrays or ArrayLists to store game history
//Bonus:
//  [X]   Handle incorrect capitalization of otherwise valid user input (rock, Rock, RoCk, ROCK, etc.)

// Basic RPS has 3 inputs; Ultimate RPS has 15
// Basic RPS inputs = Rock, Paper and Scissors
//Ultimate RPS inputs = Rock, Gun, Lightning, Devil, Dragon, Water, Air, Paper, Sponge, Wolf, Tree, Human, Snake, Scissors and Fire
//Both Basic and Ultimate output either "You won!" "You lost :(" or "It was a tie!"

import java.util.Scanner;
// Store history in ArrayList
import java.util.ArrayList;
import java.util.Random;

public class Main {

    // Create ArrayList
    ArrayList<String> userWins = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Ultimate Rock, Paper, Scissors");
        System.out.println("Developed by $pizzy Ri¢h");
        //[THIS SHOULD BE RECURSIVE]
        ask();
    }

    public static void rps() {
    // [FIX THIS LATER]
//        System.out.println("Round " + userWins.size());
        System.out.println("The battle is about to begin. Select your weapon...");
        System.out.println("Type Rock, Paper or Scissors.");
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


// Create a random generator and user weapon variable
        Random rando = new Random();
        int userWeapon = 0;

// Capture user choice, read it, lower case it and convert to weapon #
        String userChoice = grabInput();
        String lUserChoice = userChoice.toLowerCase();
        if (lUserChoice.equals("rock")) {
            userWeapon = rock;
        }
        if (lUserChoice.equals("paper")) {
            userWeapon = paper;
        }
        if (lUserChoice.equals("scissors")) {
            userWeapon = scissors;
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
                //userWins.add(false);
            }
            if (compWeapon == 2) { // vs Scissors
                System.out.println("You win! Rock vs scissors!");
                //userWins.add(true);
            }
        }
        if (userWeapon == 1) { // Paper
            if (compWeapon == 0) { //vs Rock
                System.out.println("You win! Paper vs rock!");
                //userWins.add(true);
            }
            if (compWeapon == 1) { // vs Paper
                System.out.println("It's a tie! Paper vs paper!");
                System.out.println("Go again!");
                rps();
            }
            if (compWeapon == 2) { // vs Scissors
                System.out.println("You lose! Paper vs scissors!");
                //userWins.add(false);
            }
        }
        if (userWeapon == 2) { // Scissors
            if (compWeapon == 0) { //vs Rock
                System.out.println("You lose! Scissors vs rock!");
                //userWins.add(false);
            }
            if (compWeapon == 1) { // vs Paper
                System.out.println("You win! Scissors vs paper!");
                //userWins.add(true);
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

    // Seek player input to Play, History or Quit
    public static void ask() {
        // Print out initial prompt
        System.out.println("Type Play to play Rock, Paper, Scissors!");
//        System.out.println("Type Play to play Ultimate Rock, Paper, Scissors");
        System.out.println("Or type History to see the history of your recent battles!");
        System.out.println("You may also type Quit to quit...");
        String userChoice = grabInput();
        String lUserChoice = userChoice.toLowerCase();
        if (lUserChoice.equals("play")) {
            rps();
        }
        if (lUserChoice.equals("history")) {
            // [INSERT HISTORY METHOD]
            System.out.println("");
        }
        if (lUserChoice.equals("quit")) {
            askAgain();
        }
    }

    //Ask again
    public static void askAgain() {
        System.out.println("Are you sure? Type Yes or no.");
        String userChoice = grabInput();
        String lUserChoice = userChoice.toLowerCase();
        if (lUserChoice == "yes") {
            System.exit(0);
        }
        if (lUserChoice == "no") {
            rps();
        }
    }
}
