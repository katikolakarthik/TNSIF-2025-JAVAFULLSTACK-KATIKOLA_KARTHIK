package com.karthik.exceptions;

public class NestedTryCatchExample {
    public static void main(String[] args) {
        try {
            try {
                int a = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Inner Exception: " + e);
            }
            int[] arr = new int[3];
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer Exception: " + e);
        }
    }
}
