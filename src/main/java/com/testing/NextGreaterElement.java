package com.testing;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

    public static int[] nextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Arrays.fill(result, -1); // Initialize all elements to -1
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] >= arr[stack.peek()]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                result[i] = arr[stack.peek()];
            }
            stack.push(i);
        }
        return result;
    }
    public static int[] nextGreaterElement1(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    result[i] = arr[j];
                    break; // Found the first greater element, exit inner loop
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {15, 10, 16, 20, 8, 9, 7, 50};
        int[] nge = nextGreaterElement(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " - " + nge[i]);
        }
    }
}