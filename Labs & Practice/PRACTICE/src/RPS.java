//import java.util.ArrayList;
//import java.util.Random;
//import java.util.Scanner;
//
//public class RPS {
//    /**
//     * Created by SpizzyRich on 8/4/16.
//     */
//
////Requirements
//
////Your work must:
////
////  [X]   Have a main menu with options to enter "play" or "history":
//// I also added quit.
////  [X]   If the user enters "play", they should be able to play Rock Paper Scissors against the computer
////  [X]   If the user enters "history", the program should display previous game history
////  [X]   Handle invalid user input
////  [X]   Use Arrays or ArrayLists to store game history
////Bonus:
////  [X]   Handle incorrect capitalization of otherwise valid user input (rock, Rock, RoCk, ROCK, etc.)
////  [0]   Ultimate Rock, Paper, Scissors instead of regular RPS.
//
//// Basic RPS has 3 inputs; Ultimate RPS has 15
//// Basic RPS inputs = Rock, Paper and Scissors
////Ultimate RPS inputs = Rock, Gun, Lightning, Devil, Dragon, Water, Air, Paper, Sponge, Wolf, Tree, Human, Snake, Scissors and Fire
////Both Basic and Ultimate output either "You won!" "You lost :(" or "It was a tie!"
//
//
//    public class Main {
//
//
//        public static void main(String[] args) {
//            System.out.println("Ultimate Rock, Paper, Scissors");
//            System.out.println("Developed by $pizzy Ri¢h");
//// Make recursive
//            ask();
//        }
//
//        public static void rps() {
//
//            System.out.println("The battle is about to begin.\n Select your weapon...");
//            System.out.println("Type Rock, Paper or Scissors");
////        System.out.println("Welcome to ULTIMATE ROCK, PAPER, SCISSORS! Select your weapon...");
////        System.out.println("Type Rock, Gun, Lightning, Devil, Dragon, Water, Air, Paper, Sponge, Wolf, Tree, Human, Snake, Scissors or Fire");
//// Assign weapon numbers
//            int rock = 0;
//            int paper = 1;
//            int scissors = 2;
////        int rock = 0;
////        int gun = 1;
////        int lightning = 2;
////        int devil = 3;
////        int dragon = 4;
////        int water = 5;
////        int air = 6;
////        int paper = 7;
////        int sponge = 8;
////        int wolf = 9;
////        int tree = 10;
////        int human = 11;
////        int snake = 12;
////        int scissors = 13;
////        int fire = 14;
//
//// Use an int to track who won
//            int winner;
//
//
//// Create a random generator and user weapon variable
//            Random rando = new Random();
//            int userWeapon = 0;
//
//// Capture user choice, read it, lower case it and convert to weapon #
//            String userChoice = grabInput();
//            String lUserChoice = userChoice.toLowerCase();
//            if (lUserChoice.equals("rock")) {
//                userWeapon = rock;
////        } else if (lUserChoice.equals("gun")) {
////            userWeapon = gun;
////        } else if (lUserChoice.equals("lightning")) {
////            userWeapon = lightning;
////        } else if (lUserChoice.equals("devil")) {
////            userWeapon = devil;
////        } else if (lUserChoice.equals("dragon")) {
////            userWeapon = dragon;
////        } else if (lUserChoice.equals("water")) {
////            userWeapon = water;
////        } else if (lUserChoice.equals("air")) {
////            userWeapon = air;
//            } else if (lUserChoice.equals("paper")) {
//                userWeapon = paper;
////        } else if (lUserChoice.equals("sponge")) {
////            userWeapon = sponge;
////        } else if (lUserChoice.equals("wolf")) {
////            userWeapon = wolf;
////        } else if (lUserChoice.equals("tree")) {
////            userWeapon = tree;
////        } else if (lUserChoice.equals("human")) {
////            userWeapon = human;
////        } else if (lUserChoice.equals("snake")) {
////            userWeapon = snake;
//            } else if (lUserChoice.equals("scissors")) {
//                userWeapon = scissors;
////        } else if (lUserChoice.equals("fire")) {
////            userWeapon = fire;
//            } else {
//                System.out.println("You want to fight with what??? \n Let's try that again...");
//                rps();
//            }
//// Capture computer choice; 3 for regular, 15 for ultimate
//            int compWeapon = rando.nextInt(3);
////        int compWeapon = rando.nextInt(15);
//
//// Check for ties
////        if (userWeapon == compWeapon) {System.out.println("It was a tie!");}
//// TODO: Implament Ultimate list of "weapons" using || (or)
//            if (userWeapon == 0) { // Rock
//                if (compWeapon == 0) { //vs Rock AKA TIE
//                    System.out.println("It's a tie! Rock vs rock!");
//                    System.out.println("Go again!");
//                    rps();
//                }
//                if (compWeapon == 1) { // vs Paper AKA LOSE
//                    System.out.println("You lose! Rock vs paper!");
//                    winner = 0;
//                    logHistory(0, 1, 0);
//                }
//                if (compWeapon == 2) { // vs Scissors AKA WIN
//                    System.out.println("You win! Rock vs scissors!");
//                    winner = 1;
//                    logHistory(0, 2, 1);
//                }
//            }
//            if (userWeapon == 1) { // Paper
//                if (compWeapon == 0) { //vs Rock AKA WIN
//                    System.out.println("You win! Paper vs rock!");
//                    winner = 1;
//                    logHistory(1, 0, 1);
//                }
//                if (compWeapon == 1) { // vs Paper AKA TIE
//                    System.out.println("It's a tie! Paper vs paper!");
//                    System.out.println("Go again!");
//                    rps();
//                }
//                if (compWeapon == 2) { // vs Scissors AKA LOSE
//                    System.out.println("You lose! Paper vs scissors!");
//                    winner = 0;
//                    logHistory(1, 2, 0);
//                }
//            }
//            if (userWeapon == 2) { // Scissors
//                if (compWeapon == 0) { //vs Rock AKA LOSE
//                    System.out.println("You lose! Scissors vs rock!");
//                    winner = 0;
//                    logHistory(2, 0, 0);
//                }
//                if (compWeapon == 1) { // vs Paper AKA WIN
//                    System.out.println("You win! Scissors vs paper!");
//                    winner = 1;
//                    logHistory(2, 1, 1);
//
//                }
//                if (compWeapon == 2) { // vs Scissors AKA TIE
//                    System.out.println("It's a tie! Scissors vs scissors!");
//                    System.out.println("Go again!");
//                    rps();
//                }
//            }
//            ask();
//        }
//
//
//        //Grab user choice
//        public static String grabInput() {
//            Scanner scan = new Scanner(System.in);
//            return scan.next();
//        }
//
//        // Seek player input to Play, History or Quit
//        public static void ask() {
//            // Print out initial prompt
//            System.out.println("Type Play to play Rock, Paper, Scissors!");
////        System.out.println("Type Play to play Ultimate Rock, Paper, Scissors");
//            System.out.println("Or type History to see the history of your 5 most recent battles!");
//            System.out.println("You may also type Quit to quit...");
//            String userChoice = grabInput();
//            String lUserChoice = userChoice.toLowerCase();
//
//            if (lUserChoice.equals("play")) {
//                rps();
//
//            } else if (lUserChoice.equals("history")) {
//                for (int i = 0; i < history.size(); i += 3) {
//                    int pChoice = history.get(i);
//                    int cChoice = history.get(i + 1);
//                    int winner = history.get(i + 2);
//                    String player;
//                    String comp;
//                    String won;
//                    if (pChoice == 0) {
//                        player = "rock ";
//                    } else if (pChoice == 1) {
//                        player = "paper ";
//                    } else {
//                        player = "scissors ";
////                }else if (pChoice == 1) {
////                    player = "gun";
////                }else if (pChoice == 2) {
////                    player = "lightning";
////                }else if (pChoice == 3) {
////                    player = "devil";
////                }else if (pChoice == 4) {
////                    player = "dragon";
////                }else if (pChoice == 5) {
////                    player = "water";
////                }else if (pChoice == 6) {
////                    player = "air";
////                }else if (pChoice == 7) {
////                    player = "paper";
////                }else if (pChoice == 8) {
////                    player = "sponge";
////                }else if (pChoice == 9) {
////                    player = "wolfe";
////                }else if (pChoice == 10) {
////                    player = "tree";
////                }else if (pChoice == 11) {
////                    player = "human";
////                }else if (pChoice == 12) {
////                    player = "snake";
////                }else if (pChoice == 13) {
////                    player = "scissors";
////                }else {
////                    player = "fire";
////                }
//                    }
//
//                    if (cChoice == 0) {
//                        comp = "rock ";
//                    } else if (cChoice == 1) {
//                        comp = "paper ";
//                    } else {
//                        comp = "scissors ";
////                }else if (cChoice == 1) {
////                    comp = "gun";
////                }else if (cChoice == 2) {
////                    comp = "lightning";
////                }else if (cChoice == 3) {
////                    comp = "devil";
////                }else if (cChoice == 4) {
////                    comp = "dragon";
////                }else if (cChoice == 5) {
////                    comp = "water";
////                }else if (cChoice == 6) {
////                    comp = "air";
////                }else if (cChoice == 7) {
////                    comp = "paper";
////                }else if (cChoice == 8) {
////                    comp = "sponge";
////                }else if (cChoice == 9) {
////                    comp = "wolfe";
////                }else if (cChoice == 10) {
////                    comp = "tree";
////                }else if (cChoice == 11) {
////                    comp = "human";
////                }else if (cChoice == 12) {
////                    comp = "snake";
////                }else if (cChoice == 13) {
////                    comp = "scissors";
////                }else {
////                    comp = "fire";
//                    }
//                    if (winner == 0) {
//                        won = "The computer ";
//                    } else {
//                        won = "You ";
//                    }
//
//                    System.out.println(won + "won when you used " + player + "against the computer's " + comp);
//                    ask();
//                }
//            } else if (lUserChoice.equals("quit")) {
//                askAgain();
//            } else {
//                System.out.println("You want to what? \n Let's try this again...");
//                ask();
//            }
//        }
//
//        //Ask again
//        public static void askAgain() {
//            System.out.println("Are you sure? Type Yes or no.");
//            String userChoice = grabInput();
//            String lUserChoice = userChoice.toLowerCase();
//            if (lUserChoice == "yes") {
//                System.exit(0);
//            } else if (lUserChoice == "no") {
//                ask();
//            } else {
//                System.out.println("Check your spelling and try again.");
//            }
//        }
//
//        public static ArrayList<Integer> history = new ArrayList();
//
//        public static void logHistory(int playerWeapon, int compWeapon, int winner) {
//            history.add(playerWeapon);
//            history.add(compWeapon);
//            history.add(winner);
//        }
//
//    }
//
//}
