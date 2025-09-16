package com.karthik.armstrong;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int originalNum = num;
        int result = 0;
        int n = String.valueOf(num).length(); // number of digits

        // Calculate sum of power of digits
        while (num != 0) {
            int digit = num % 10;
            result += Math.pow(digit, n);
            num /= 10;
        }

        // Check Armstrong
        if (result == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is NOT an Armstrong number.");
        }

        sc.close();
    }
}
