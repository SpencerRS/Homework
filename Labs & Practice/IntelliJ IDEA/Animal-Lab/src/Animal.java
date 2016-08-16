/**
 * Created by SpizzyRich on 8/3/16.
 */
public class Animal {

    static int mNumLegs;
    static double mTopSpeed;
    static boolean mIsEndangered;
    static String mName;

    public Animal(String name, boolean isEndangered, int numLegs, double topSpeed) {
        this.mName = name;
        this.mIsEndangered = isEndangered;
        this.mNumLegs = numLegs;
        this.mTopSpeed = topSpeed;
    }

    public String getmName() {
        return mName;
    }

    public boolean getmIsEndangered() {
        return mIsEndangered;
    }

    public int getmNumLegs() {
        return mNumLegs;
    }

    public double getmTopSpeed() {
        return mTopSpeed;
    }

    public void setmName(String name) {
        this.mName = name;
    }

    public void setmIsEndangered(boolean isEndangered) {
        this.mIsEndangered = isEndangered;
    }

    public void setmNumLegs(int numLegs) {
        this.mNumLegs = numLegs;
    }

    public void setmTopSpeed(double topSpeed) {
        this.mTopSpeed = topSpeed;
    }




    public static void main(String[] args) {
        Animal goose = new Animal("Goose", false, 2, 100);
        //Animal floobleCrank = new Animal ("Flooble Crank", true, 13, 100);
        System.out.println(goose.getmName() + " is an animal with " + goose.getmNumLegs() + " legs which allow it to go " + goose.getmTopSpeed() + "[SPEED UNITS] per [TIME UNITS]");
        goose.setmTopSpeed(76);
        System.out.println(mName + " is an animal with " + mNumLegs + " legs which allow it to go " + mTopSpeed + "[SPEED UNITS] per [TIME UNITS]");

    }
}
