import java.sql.Array;
import java.util.ArrayList;

/**
 * Created by SpizzyRich on 8/18/16.
 */
public class Main {

    public static void main(String[] args) {

        String DNA = "GTAGTAGTA";
       String CompDNA = makeComplement(DNA);
    }

    public static String makeComplement(String dna) {
        ArrayList<String> complementary = new ArrayList<>();
        for (int i = 0; i < dna.length(); i++) {
            String sideA = dna.substring(i, i + 1);
            if (sideA.toUpperCase().equals("A")) {
                complementary.add("T");
            } else if (sideA.toUpperCase().equals("T")) {
                complementary.add("A");
            } else if (sideA.toUpperCase().equals("C")) {
                complementary.add("G");
            } else if (sideA.toUpperCase().equals("G")) {
                complementary.add("C");
            } else {
                System.out.println("That's not DNA! That's a mutant! Or an Alien!");
            }
        }
      String joinedComplement = complementary.toArray().toString().join(" ");
    return joinedComplement;
    }
}
