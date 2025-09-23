package com.karthik.exceptions;

public class ArithmeticException {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println("ArithmeticException caught: " + e);
        }
    }
}