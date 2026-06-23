package com.deepak.aiml;
import java.util.Scanner;


public class CH01_05_PracticeSet1 {
    public static void main(String[] args) {
//        Question 1 - Sum three number
        int num1 = 53;
        int num2 = 623;
        float num3 = 7434.344f;
        float sum = num3 + num1 + num2;
        System.out.println(sum);

//        question 2 - Take input of users name
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.printf("Hey %s how are you", name);

//        km to miles ( 1 km =  0.62137119 miles)
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Distance in km : ");
        float km = sc.nextFloat();
        float miles = (km)*(0.62137119f);
        System.out.printf("Distance of %.3f km is equal to %.3f miles", km, miles);
    }
}
