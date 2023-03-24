package com.codereview;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 5, 4};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
