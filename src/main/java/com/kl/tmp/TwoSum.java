package com.kl.tmp;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSum {

    public int[] twoSum(int[] nums, int target){
        int[] indexs = new int[2];
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for(int i = 0; i<nums.length;i++){
            // 如果当前下标元素在map有
            if (hash.containsKey(nums[i])){
                indexs[0] = i;
                indexs[1] = hash.get(nums[i]);
                return indexs;
            }
            // 获取 目标元素值与下标
            hash.put(target-nums[i], i);
        }

        return indexs;
    }

    public static void main(String[] args) {
        int[] testList = {1,2,3};
        int num = 3;
        TwoSum testobj = new TwoSum();
        int[] result  = testobj.twoSum(testList, num);
        System.out.println(result[0]);



    }
}
