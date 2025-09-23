package com.karthik.strings;

public class StringLiteralExample {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "World";

        System.out.println("s1 == s2 : " + (s1 == s2));
        System.out.println("s1.equals(s3): " + s1.equals(s3));
        System.out.println("Length: " + s1.length());
        System.out.println("Uppercase: " + s1.toUpperCase());
        System.out.println("Lowercase: " + s1.toLowerCase());
        System.out.println("Substring: " + s1.substring(1, 4));
    }
}
