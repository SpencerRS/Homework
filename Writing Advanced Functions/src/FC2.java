/**
 * Created by SpizzyRich on 8/4/16.
 */
//Write a function that takes in two words and compares them. If the spelling is the same, the functions returns true, otherwise false.

public class FC2 {

    public boolean isSame(String word1, String word2){

        String modWord1 = word1.toLowerCase();
        String modWord2 = word2.toLowerCase();
                return modWord1.equals(modWord2);

    }

}
