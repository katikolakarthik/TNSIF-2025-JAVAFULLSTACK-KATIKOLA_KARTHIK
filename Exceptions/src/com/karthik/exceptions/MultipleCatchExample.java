package com.karthik.exceptions;

public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;             
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); 
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e);
        } catch (Exception e) {
            System.out.println("General Exception: " + e);
        }
    }
}
