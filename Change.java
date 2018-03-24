package com.company;

import java.util.Stack;

public class Change {
    public static void count_change(int cash, Stack<Integer> money_stack){
        int count = 0;
        int temp = 0;
        while (!money_stack.isEmpty()) {
            if (cash < money_stack.pop()) {}
            else {
                money_stack.pop();
                cash -= temp;
                money_stack.push(temp);
                count += 1;
            }
        }
        System.out.print(count);
    }
}
