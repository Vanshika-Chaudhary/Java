package com.thealgorithms.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

    // Returns all permutations of the given string
    public static List<String> permute(String str) {
        List<String> result = new ArrayList<>();
        permuteHelper(str.toCharArray(), 0, str.length() - 1, result);
        return result;
    }

    // Recursive helper function for generating permutations
    private static void permuteHelper(char[] str, int left, int right, List<String> result) {
        if (left == right) {
            result.add(String.valueOf(str));
        } else {
            for (int i = left; i <= right; i++) {
                swap(str, left, i);
                permuteHelper(str, left + 1, right, result);
                swap(str, left, i); // backtrack
            }
        }
    }

    // Utility function to swap two characters in an array
    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
