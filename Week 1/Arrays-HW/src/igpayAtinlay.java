import java.util.ArrayList;

/**
 * Created by SpizzyRich on 8/3/16.
 */
//    Create a method that, given an ArrayList of words (Strings), turns each word into Pig Latin. The rules of Pig Latin are as follows: a. The first consonant is moved to the end of the word and suffixed with an ay. b. If a word begins with a vowel you just add way to the end.

public class igpayAtinlay {
    char[] vowls = {"a"", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
    public static void main(String[] args) {
        //Sung note: Should have a method
    }
        ArrayList<String> pig = new ArrayList<>();
        pig.add("apple");
        pig.add("cat");
        pig.add("train");
        //identify consonants (not a,e,i,o,u,y)

        //String vowls = "aeoiuyAEIOUY";

        char firstLetter
        for (int i = 0; i < pig.size(); i++) {
            firstLetter = String.valueOf(pig[i].charAt(0));
        }

        //if first letter is consonant move first consonant to end
//        if (firstLetter == vowls[i];
        //add "ay" to end
        System.out.println(pig[?]+"ay");
        //else add "way" to end
        System.out.println(pig[?]+"way");
    }
    }

// Sung's Solution
//
//    Sung Won Chun [6:54 PM]
//    ArrayList<String> pigLatin = new ArrayList<>();
//       pigLatin.add("bug");
//       pigLatin.add("dorky");
//       pigLatin.add("numby");
//       pigLatin.add("asshole");
//       for (int i = 0; i < pigLatin.size() ; i++) {
//        System.out.println(pigLatinizer(pigLatin.get(i)));
//    }
//
//}
//
//    public static String pigLatinizer(String word){
//        String[] wordStorage = word.split("");
//        String pigged = "";
//        String[] vowel = new String[5];
//        vowel[0] = "a";
//        vowel[1] = "e";
//        vowel[2] = "i";
//        vowel[3] = "o";
//        vowel[4] = "u";
//        if (wordStorage[0].equals(vowel[0]) || wordStorage[0].equals(vowel[1]) || wordStorage[0].equals(vowel[2]) || wordStorage[0].equals(vowel[3]) || wordStorage[0].equals(vowel[4])){
//            for (int i = 1; i < word.length(); i++) {
//                pigged = pigged + wordStorage[i];
//            }
//            pigged = pigged + "way";
//        } else {
//            for (int i = 1; i < word.length(); i++) {
//                pigged = pigged + wordStorage[i];
//            }
//            pigged = pigged + wordStorage[0]+ "ay";
//        }
//        return pigged;
//    }
