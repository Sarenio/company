package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Stack<Integer> money_stack = new Stack<Integer>();
        money_stack.push(1);
        money_stack.push(2);
        money_stack.push(5);
        money_stack.push(10);
        money_stack.push(20);
        money_stack.push(50);
        money_stack.push(100);
        int cash = 124;
        count_change(cash, money_stack);
    }
    private static void count_change(int cash, Stack<Integer> money_stack) {
        int count = 0;
        while (!money_stack.isEmpty()) {
            int temp = money_stack.pop();
            if (cash >= temp) {
                cash -= temp;
                money_stack.push(temp);
                count += 1;
            }
        }
        System.out.print(count);
    }
}


