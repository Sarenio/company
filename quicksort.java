package com.company;
import java.util.*;

public class quicksort {
    public static void quickSort(int[] list, int size) {
        int low = 0;
        int high = size-1;
        int pivotLocation;
        Integer temp[] = {0,0};
        Stack<Integer[]> s = new Stack<Integer[]>();
        s.push(temp); // a marker to identify the bottom of the stack
        while (!s.isEmpty()) {
            while (low <= high) {
                pivotLocation = partition(list, low, high);
                Integer temp1[] = {pivotLocation + 1, high};
                s.push(temp1); // record info for second recursive call
                high = pivotLocation-1; // execute first recursive call
            }
            low = s.pop()[0];
            high = s.pop()[1]; // fetch next recursive call to execute
        }
    }
    private static int partition(int[] a, int low, int high)
    {
        int x = a[high];
        int i = low-1;
        int temp=0;
        for(int j=low; j<high-1; j++)
        {
            if(a[j]<=x)
            {
                i++;
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        temp = a[i+1];
        a[i+1] = a[high];
        a[high] = temp;
        return (i+1);
    }
}

