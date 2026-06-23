package com.deepak.aiml;
import java.util.Scanner;

public class CH01_03_User_Input {
   public static void main(String[] args) {
       System.out.print("Taking input from user : ");
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter a number 1: ");
       float i1 = sc.nextFloat();

       System.out.println("Enter a number 2: ");
       float i2 = sc.nextFloat();

       float sum = i1 + i2;
       System.out.printf("Sum of %f and %f is : " ,i1 , i2);
       System.out.print(sum);

       boolean b1 = sc.hasNextInt();
       System.out.println(b1);

       String src = sc.next();
       System.out.println(src);

       String src1 = sc.nextLine();
       System.out.println(src1);

    }
}