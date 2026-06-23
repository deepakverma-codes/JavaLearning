package com.deepak.aiml;
import java.util.Scanner;

public class CH06_03_MultiDimensionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 2-D array
        int[][] number = new int[2][3];
        number[0][0] = 1;
        number[0][1] = 2;
        number[0][2] = 3;
        number[1][0] = 4;
        number[1][1] = 5;
        number[1][2] = 6;
        // System.out.println(number.length); 2
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                System.out.print(number[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        // User input
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
}
