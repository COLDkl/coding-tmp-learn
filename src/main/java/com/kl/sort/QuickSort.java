package com.kl.sort;


import java.util.*;

public class QuickSort {

    public static int getPosition(int[] arr, int low, int high) {
        int key = arr[low];
        while (low < high) {
            while (arr[high] > key && high > low) high--;
            arr[low] = arr[high];
            while (arr[low] < key && low < high) low++;
            arr[high] = arr[low];
        }
        arr[low] = key;
        return low;
    }


    private static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int position = getPosition(arr, low, high);
            sort(arr, low, position - 1);
            sort(arr, position + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            try {
                arr[i] = Integer.valueOf(args[i]);

            } catch (NumberFormatException e) {
                System.out.println("input invalid decimal integer:" + e.getMessage());
                return;
            }
        }
        System.out.println("befort sort:" + Arrays.toString(arr));
        sort(arr, 0, arr.length - 1);
        System.out.println("after sort:" + Arrays.toString(arr));

    }
}
