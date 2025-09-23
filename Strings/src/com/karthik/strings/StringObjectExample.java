package com.karthik.strings;

public class StringObjectExample {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        String s3 = new String("Java");

        System.out.println("s1 == s2 : " + (s1 == s2));
        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("Concat: " + s1.concat(" World"));
        System.out.println("Char at 1: " + s1.charAt(1));
        System.out.println("Index of 'l': " + s1.indexOf('l'));
        System.out.println("Replace l->x: " + s1.replace('l','x'));
    }
}
