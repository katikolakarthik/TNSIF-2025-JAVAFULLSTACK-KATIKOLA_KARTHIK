package com.karthik.primenumber;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int originalNum = num;
        int reversedNum = 0;

        // Reverse the number
        while (num != 0) {
            int digit = num % 10;        // extract last digit
            reversedNum = reversedNum * 10 + digit; 
            num = num / 10;              // remove last digit
        }

        // Check palindrome
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a Palindrome.");
        } else {
            System.out.println(originalNum + " is NOT a Palindrome.");
        }

        sc.close();
    }
}
