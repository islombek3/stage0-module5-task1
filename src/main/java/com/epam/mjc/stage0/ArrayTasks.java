package com.epam.mjc.stage0;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        String[] seasonsArray = {"winter", "spring", "summer", "autumn"};
        return seasonsArray;
    }

    /**
     * Generate an int[] array of consecutive positive integers
     * starting at 1 of the given length (length parameter > 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1]
     * length = 3  -> [1, 2, 3]
     * length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int[] gen =  new int[length];
        for (int i = 0; i < length; i++){
            gen[i] = i+1;
        }
        return gen;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9
     * arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int num = 0;
        for (int i = 0; i < arr.length; i++){
            num += arr[i];
        }
        return num;
    }

    /**
     * Return the index of the first occurrence of number in the arr array.
     * If there is no such element in the array, return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2
     * arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        int i = 0;
        while (i < arr.length){
            if (arr[i] == number)
                return i;
            i++;
        } 
        return -1;
    }

    /**
     * Return the new String[] array obtained from the arr array
     * by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"]
     * arr = ["pineapple", "apple", "pen"] -> ["pen", "apple", "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String[] revArr = new String[arr.length];
        int x = 1;
        for (int i = 0; i < arr.length; i++){
            revArr[i] = arr[arr.length - x];
            x++;
        }
        return revArr;
    }

    /**
     * Return new int[] array obtained from arr int[] array
     * by choosing positive numbers only.
     * P.S. 0 is not a positive number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3]
     * arr = [-1, -2, -3]   -> []
     * arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int l = 0;
        for (int i : arr){
            if (i > 0){
                l++;
            }
        }
        int[] newArr = new int[l];
        int x = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 0)
                newArr[i - x] = arr[i];
            else
                x++;
        }
        return newArr;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules:
     * Incoming one-dimensional arrays must be arranged in ascending order of their length;
     * numbers in all one-dimensional arrays must be in ascending order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]]
     * arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
        for (int a = 0; a < arr.length; a++){
            for (int b = 0; b < arr[a].length - 1; b++){
                for (int c = 0; c < arr[a].length - 1; c++){
                    if (arr[a][c] > arr[a][c+1]){
                        int temp = arr[a][c];
                        arr[a][c] = arr[a][c+1];
                        arr[a][c+1] = temp;   
                    }
                }
            }
        }
        for (int a = 0; a < arr.length - 1; a++){
            for (int b = 0; b < arr.length - 1; b++){
                if (arr[b].length > arr[b+1].length){
                    int[] temp = arr[b];
                    arr[b] = arr[b+1];
                    arr[b+1] = temp;   
                }
            }
        }
        return arr;
    }
}
