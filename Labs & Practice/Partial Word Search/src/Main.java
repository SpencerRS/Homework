import java.util.ArrayList;

import java.util.Arrays;

/**
 * Created by SpizzyRich on 8/17/16.
 */
public class Main {

    public static void main(String[] args) {
        String[] dictionary = {"flame", "chicken", "menu", "meal", "eat"};
        findWord("me", dictionary);
    }

    public static String[] findWord(String searchable, String[] dictionary) {
        char firstSearchableChar = searchable.charAt(0);
        String searching;
        String searchingChunk;
        String[] notFull = {"Empty"};
        ArrayList<String> matches = new ArrayList<>();
        for (int i = 0; i < dictionary.length; i++) {
            searching = dictionary[i];
            String lSearching = searching.toLowerCase();
            for (int j = 0; j < lSearching.length(); j++) {
                if (firstSearchableChar == lSearching.charAt(j)) {
                    searchingChunk = lSearching.substring(j, j + searchable.length());
                    if (searchingChunk.equals(searchable)) {
                        matches.add(dictionary[i]);
                    }
                }
            }

        }
        if (matches.size() > 0) {
            return matches.toArray(new String[matches.size()]);
        }
        else{
            return notFull;
        }
    }
}
