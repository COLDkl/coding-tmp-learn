package com.kl.tmp;

public class ReverseString {

    /**
     * 递归原地反转
     * 时间复杂度 O(N)
     * 空间复杂度 O(N)
     * @param s
     * @param left
     * @param right
     */

    public void helper(char [] s, int left, int right){
        if(left >= right) return;
        char tmp = s[left];
        s[left++] = s[right];
        s[right--] = tmp;
        helper(s, left, right);
    }

    public void reverseString(char[] s){
        helper(s, 0, s.length - 1);
    }

    public void reverseStringDoublePointer(char[] s){
        int left = 0,right = s.length - 1;
        while (left < right){
            char tmp = s[left];
            s[left++] = s[right];
            s[right--] = tmp;
        }
    }
}
