/**
 * Created by SpizzyRich on 8/3/16.
 */

import java.util.ArrayList;

public class concreteJungle {
//    Concrete Jungle a. Create an ArrayList of New York City wildlife. b. Create a function that, given an ArrayList of Strings, prints for each element: "Today, I spotted a /Thing here/ in the concrete jungle!"

    public static void main(String[] args) {
        ArrayList<String> wildlife = new ArrayList<>();
        wildlife.add("squirrel");
        wildlife.add("pidgeon");
        wildlife.add("rat");
        wildlife.add("roache");
        wildlife.add("dog");
        for ( int i=0; i< wildlife.size(); i++){
            System.out.println("Today, I spotted a " + wildlife.get(i) + " in the concrete jungle!");
        }
    }
}
