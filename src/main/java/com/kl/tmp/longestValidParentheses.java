package com.kl.tmp;

import java.util.Stack;

public class longestValidParentheses {
    public int longeStValidParentheses(String s) {
        Stack<Character> stack = new Stack<Character>();
        int num = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
                num++;
            } else if (stack.contains('(') && c == ')') {
                stack.pop();
                num++;
            }
        }
        return num - stack.size();

    }

    public static void main(String[] args) {
        System.out.println(new longestValidParentheses().longeStValidParentheses("()(()"));
    }
}
