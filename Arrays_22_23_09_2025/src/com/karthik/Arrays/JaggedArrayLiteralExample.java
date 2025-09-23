package com.karthik.Arrays;

public class JaggedArrayLiteralExample {
    public static void main(String[] args) {
        int[][] arr = { {1, 2, 3},{2, 3},{4},{2, 3, 4, 5}
        };

        System.out.println("Jagged Array Elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
