// [REMOVE THIS WHEN HISTORY WORKS]

//// Store history in ArrayList?
//
//import java.util.ArrayList;
//
///**
// * Created by SpizzyRich on 8/5/16.
// */
//public class History {
//
//
//    // Create ArrayList for history feature
//    ArrayList<String> userWins = new ArrayList<>();
//    ArrayList<String> compWins = new ArrayList<>();
//    ArrayList<String> rpsHistory = new ArrayList<>();
//
//    // Prints concatenated string of user wins, comp wins and total number of rounds
//    public String historyStatement() {
//        System.out.println("You have played " + (rpsHistory.size() - 1) + " rounds. \n You have won " + (userWins.size() - 1) + " and the computer has won " + (compWins.size() - 1));
//    }
//// log user win and expand base history
//    public String addUserWin() {
//        userWins.add(0);
//        rpsHistory.add(0);
//    }
//
//    public String addCompWin() {
//        compWins.add(0);
//        rpsHistory.add(0);
//    }
//
//
//}
