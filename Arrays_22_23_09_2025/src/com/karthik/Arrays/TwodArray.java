package com.karthik.Arrays;

import java.util.Random;

public class TwodArray {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Random rand = new Random();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = rand.nextInt(100) + 1;
            }
        }

        System.out.println("2D Array (Matrix):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
