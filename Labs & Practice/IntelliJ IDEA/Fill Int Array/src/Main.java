import java.util.ArrayList;
import java.util.Arrays;


/**
 * Created by SpizzyRich on 8/12/16.
 */
public class Main {

    public static void main(String[] args) {
        int[] ints = {6, 13, 12};
        System.out.println(fillArray(ints));
    }

    public static ArrayList<Integer> fillArray(int[] in) {
        Arrays.sort(in);
        int startNum = in[0];
        int endNum = in[in.length-1];
        ArrayList<Integer> out = new ArrayList<Integer>();
        for (int i = 0; i <= (endNum - startNum); i++) {
            out.add(startNum + i);

        }
        int[] trueOut
        return trueOut;
    }
}
