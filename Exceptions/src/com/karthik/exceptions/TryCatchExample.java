package com.karthik.exceptions;

public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
