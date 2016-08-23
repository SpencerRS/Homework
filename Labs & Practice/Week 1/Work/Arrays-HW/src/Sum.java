/**
 * Created by SpizzyRich on 8/3/16.
 */
public class Sum {
    //    Create a method that, given an array of ints, return the sum of the first 2 elements in the array. If the array length is 1, just return the single element, and return 0 if the array is empty (has length 0).
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int[] one = {87};
        int[] empty = {};
        if (nums.length == 0) {
            System.out.println(0);
        } else if (nums.length == 1) {
            System.out.println(nums[0]);
        } else {
            System.out.println(nums[0] + nums[1]);
        }


    }

}
