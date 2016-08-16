import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given an array of integers, return the sum of the two largest values.
 * <p>
 * If the array is empty, return 0.
 * If the array has one value, return that value.
 *
 * @param array An array of integers of any size.
 * @return Sum of the two largest values
 */


public class Main {
    public static void main(String[] args) {
        int[] nums = {4, 8, 15, 16, 23, 4, 15, 42};
        System.out.println(sumOfTwoLargest(nums));

    }

    public static int sumOfTwoLargest(int[] array) {
        int biggestNum = array[0];
        int secondBiggest = array[0];
        int nextNum = array[0];
        int lastNum;

        for (int i = 0; i < array.length; i++) {
            nextNum = array[i];
            if (i > 0) {
                lastNum = array[i - 1];
            }

            if (biggestNum < nextNum) {
                biggestNum = nextNum;
            }
            for (int j = 0; j < array.length; j++) {
                nextNum = array[j];
                if (secondBiggest < nextNum && biggestNum > nextNum) {

                    secondBiggest = nextNum;
                }
            }
        }
        return (biggestNum + secondBiggest);
    }
}
