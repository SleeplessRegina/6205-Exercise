package edu.northeastern.XuanyingWang;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        System.out.println(twoSum(arr, 9));
    }

    // If we just want to find the 2 values inside the array whose sum = target
    private static boolean twoSum(int[] arr, int target) {
        if (arr == null || arr.length <= 1) {
            return false;
        }
        Arrays.sort(arr);

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] + arr[end] == target) {
                return true;
            } else if (arr[start] + arr[end] > target) {
                end--;
            } else {
                start++;
            }
        }
        return false;
    }

