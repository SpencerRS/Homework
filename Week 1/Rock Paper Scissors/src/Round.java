/**
 * Created by SpizzyRich on 8/5/16.
 */
public class Round {
    public String mUserChoice;
    public String mCompChoice;
    public String mWinner;
    public String mTimeStamp;

    public Round(String userChoice, String compChoice, String winner, String timeStamp) {
        this.mUserChoice = userChoice;
        this.mCompChoice = compChoice;
        this.mWinner = winner;
        this.mTimeStamp = timeStamp;
    }
// Getter and setter for mUserChoice
    public String getmUserChoice(){
        return mUserChoice;
    }
    public void setmUserChoice(String userChoice){
        this.mUserChoice = userChoice;
    }

// Getter and setter for mCompChoice
    public String getmCompChoice(){
        return mCompChoice;
    }
    public void setmCompChoice(String compChoice){
        this.mCompChoice = compChoice;
    }

// Getter and setter for mWinner
    public String getmWinner(){
        return mWinner;
    }
    public void setmWinner(String winner){
        this.mWinner = winner;
    }

// Getter and setter for mTimeStamp
    public String getmTimeStamp(){
        return mTimeStamp;
    }
    public void setmTimeStamp(String timeStamp){
        this.mUserChoice = timeStamp;
    }

}
