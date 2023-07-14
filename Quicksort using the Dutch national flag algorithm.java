import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class Solution {

    // swap function 
    public static void swap(ArrayList<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

    // quick sort function
    public static void DNF(ArrayList<Integer> arr, int low, int high) {
        if (low < high) {
            int pivot = arr.get(low);
            int i = low;
            int j = low;
            int k = high;
            while (j <= k) {
                if (arr.get(j) < pivot) {
                    swap(arr, i, j);
                    i++;
                    j++;
                } else if (arr.get(j) > pivot) {
                    swap(arr, j, k);
                    k--;
                } else {
                    j++;
                }
            }
            DNF(arr, low, i - 1);
            DNF(arr, k + 1, high);

        }
    }

    // driver function 
    public static ArrayList<Integer> quickSortUsingDutchNationalFlag(ArrayList<Integer> arr) {
        // Write your code here.
        int low = 0;
        int high = arr.size() - 1;
        DNF(arr, low, high);
        return arr;
    }
}
