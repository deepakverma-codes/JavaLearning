package com.deepak.aiml;
import java.util.Scanner;

public class CH06_04_PracticeSet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Ques 1 ( sum of array )
       /* int sum = 0;
        int [] marks = {34, 45, 67, 78, 89};
        for (int element : marks){
            sum += element;
        }
        System.out.println(sum);
        */

        // Ques 2 ( given int is present in array or not )
        /* boolean found = false;
        int num = sc.nextInt();
        int [] array = {34, 56, 78, 35, 98, 12};
        for (int element : array){
            if (element == num) {
                 found = true;
                 break;
            }
        }
        if (found){
            System.out.println("Num is present in array");
        }
        else{
            System.out.println("Num ia not present in array");
        }

         */

        // Ques 3 ( avg calc by array )
//        int sum = 0;
//        int [] marks = {34, 45, 67, 78, 89};
//        for (int element : marks){
//            sum += element;
//        }
//        double avg = (double) sum / marks.length;
//        System.out.println(avg);


        // ques 4 ( add two matrix )
//        int [][] mat1 = {{1,2,3,},
//                         {4,5,6}};
//        int [][] mat2 = {{3,5,0,},
//                         {1,5,6}};
//        int [][] result = {{0,0,0,},
//                         {0,0,0}};
//
//        for (int i = 0; i< mat1.length; i++){
//            for (int j = 0; j<mat1[i].length; j++){
//                result[i][j] = mat1[i][j] + mat2[i][j];
//                System.out.print(result[i][j]);
//                System.out.print("  ");
//            }
//            System.out.print("\n");
//        }


        // Ques 5 ( find max and min element of array )
//        int [] arr = {34, 45, 67, 322, 665, 0};
//        int max = arr[0];
//        for (int element : arr) {
//            if (element > max) {
//                max = element;
//            }
//        }
//        System.out.println(max);


        // Ques ( check whether array is sorted or not )
        boolean shortedArray = true;
        int[] array = {7,7,65,87};
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i+1]) {
                shortedArray = false;
                break;
            }
        }
        System.out.println(shortedArray? "Sorted" : "Not Sorted");
    }
}
