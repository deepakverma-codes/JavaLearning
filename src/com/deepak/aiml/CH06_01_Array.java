package com.deepak.aiml;
import java.util.Scanner;

public class CH06_01_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // There are mainly two ways to declare array

        // Way 1. (Declaration and memory allocation at once)
        int[] array = new int[4];

        // Assign array element
        array[0] = 56;
        array[1] = 75;
        array[2] = 40;
        array[3] = 100;

        // Accessing array element
        System.out.println(array[0]);

        // Way 2. (Declaration and initialization)
        int [] array1 = {34,32,56,865,56};
        array1[0] = 45; // You can change its value
        System.out.println(array1[0]);

        // Input of array
        System.out.print("Enter number of element: ");
        int n = sc.nextInt();
        System.out.println("Enter array element: ");
        int [] numbers = new int[n];
        for (int i = 0; i < n; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("Array element are: ");
        for (int element : numbers){
            System.out.print(element+",");
        }
    }
}
