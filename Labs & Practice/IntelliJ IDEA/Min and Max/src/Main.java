import java.util.Arrays;

/**
 * Created by SpizzyRich on 8/15/16.
 */
public class Main {
    public static void main(String[] args) {
        int[] ints = {100, 3000, 20, 800000, 600};
        System.out.println(min(ints));
        System.out.println(max(ints));
    }

    public static int min(int[] ints) {
        Arrays.sort(ints);
        return ints[0];
    }

    public static int max(int[] ints) {
        Arrays.sort(ints);
        return ints[ints.length - 1];
    }
}
