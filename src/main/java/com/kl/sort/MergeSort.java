package com.kl.sort;

import java.util.Arrays;

public class MergeSort {

    public static int[] sort(int[] a, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            sort(a, low, mid);
            sort(a, mid + 1, high);
            //左右归并
            merge(a, low, mid, high);
        }
        return a;

    }

    public static void merge(int[] a, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        // 把较小的数移动新数组中
        while (i <= mid && j <= high) {
            if (a[i] <= a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }
        // 把左边剩余数据移入数组
        while (i <= mid) {
            temp[k++] = a[i++];
        }
        //把右边剩余数移入数组
        while (j <= high) {
            temp[k++] = a[j++];
        }
        // 把新数组中的数覆盖nums数组
        for (int x = 0; x < temp.length; x++) {
            a[x + low] = temp[x];

        }
    }

    public static void main(String[] args) {
        int[] testarr = {1, 2, 3, 0, 6, 4, 0, 1};
        sort(testarr, 0, testarr.length - 1);
        System.out.println(Arrays.toString(testarr));
    }
}
