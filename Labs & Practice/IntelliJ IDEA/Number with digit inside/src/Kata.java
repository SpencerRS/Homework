import java.util.ArrayList;
import java.util.stream.IntStream;

/**
 * Created by SpizzyRich on 8/19/16.
 */
public class Kata {
    public static long[] NumbersWithDigitInside(long x, long d) {
//        ArrayList<Integer> contents = new ArrayList<Integer>();
        long count = 0;
        long sum = 0;
        long product = 1;
        long[] answer = new long[3];
        for (int i = 1; i < x; i++) {
            if (String.valueOf(i).contains(String.valueOf(d))) {
//    contents.add(i);
                count += 1;
                sum += i;
                product *= i;
            }
        }
//        answer[0] = contents.size();
        answer[0] = count;
        answer[1] = sum;
        answer[3] = product;
        return answer;
    }
}
