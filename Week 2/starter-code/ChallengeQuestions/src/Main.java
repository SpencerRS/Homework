import java.util.*;

import.java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Nothing in the main method will be tested
    }

    /**
     * Question 1: Find the smallest and largest numbers in an array
     * <p>
     * You are given an array of integers, with at least two values.
     * Find the smallest and largest numbers in the array, and pass them back in an array containing two values,
     * the largest and smallest.
     * <p>
     * You MAY ONLY use arrays, not other collections types (ie Lists).
     * <p>
     * YOU CAN'T USE A SORTING METHOD BUILT INTO JAVA
     *
     * @param array An array of integers with at least two values
     * @return An array of integers with two elements, the largest and smallest from the method parameter
     */
    public static int[] findLargestAndSmallest(int array[]) {

        int biggestNum = array[0];
        int smallestNum = array[0];
        int nextNum = array[0];

        for (int i = 0; i < array.length; i++) {
            nextNum = array[i];


            if (biggestNum < nextNum) {
                biggestNum = nextNum;
            }
            if (smallestNum > nextNum) {
                smallestNum = nextNum;
            }
        }
        int[] largestAndSmallest = {smallestNum, biggestNum};
        return largestAndSmallest;
    }


    /**
     * Question 2: Remove duplicates from an array
     * <p>
     * You are given an array of ints that might have duplicates. You must remove any duplicates from the array,
     * and return an array that doesn't contain duplicates. The order of the elements in the original array
     * does not need to be kept the same.
     * <p>
     * You MAY use any collections types you wish, but the method must return an array.
     * <p>
     * Example: [1,4,3,2,1] would return, in any order, [1,2,3,4]
     *
     * @param array An array of ints that may or may not include duplicates
     * @return An array of ints that doesn't contain duplicates.
     */
    public static Object[] removeDuplicatesFromArray(int[] array) {
        ArrayList<Integer> listedForm = new ArrayList<>();
        int toAdd;
        for (int i = 0; i < array.length; i++) {
            Integer toBeAdded = new Integer(toAdd);
            listedForm.add(toBeAdded);
        }
        Arrays.sort(listedForm);
        for (int i = 0; i < listedForm.size(); i++) {
            if (i == i + 1) {
                listedForm.remove(i + 1);
            }
        }
        Integer[] fixedArray = new Integer[listedForm.size()];
        fixedArray = listedForm.toArray(fixedArray);
        return fixedArray;
    }

    /**
     * Given an array of integers, return the sum of the two largest values.
     * <p>
     * If the array is empty, return 0.
     * If the array has one value, return that value.
     *
     * @param array An array of integers of any size.
     * @return Sum of the two largest values
     */
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

    //BONUS QUESTION IS BELOW

    /**
     * BONUS:
     * <p>
     * Given two sorted arrays of integers, return a sorted array of the two original arrays merged together.
     * All valid numbers in these arrays are greater than 0.
     * <p>
     * array1 has enough empty space (represented by the value 0) to hold all valid values from the original two arrays
     * combined. The returned array must be array1 with the new values merged in.
     * <p>
     * For example:
     * array1 = [1,4,7,9,0,0,0]
     * array2 = [1,5,11]
     * returned array = [1,1,4,5,7,9,11]
     * <p>
     * No test cases are provided for this method, you will need to test it on your own.
     *
     * @param array1 Array of sorted integers
     * @param array2 Array of sorted integers
     * @return Array of sorted integers, merged from array1 and array2
     */
    public static int[] mergeSortedArrays(int[] array1, int[] array2) {
        return null;
    }
}
