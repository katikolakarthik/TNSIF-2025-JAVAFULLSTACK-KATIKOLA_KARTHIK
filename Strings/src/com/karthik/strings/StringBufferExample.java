package com.karthik.strings;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");
        System.out.println("Append: " + sb);

        sb.insert(5, " Java");
        System.out.println("Insert: " + sb);

        sb.replace(6, 10, "Python");
        System.out.println("Replace: " + sb);

        sb.delete(6, 12);
        System.out.println("Delete: " + sb);

        sb.reverse();
        System.out.println("Reverse: " + sb);

        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Length: " + sb.length());
    }
}
