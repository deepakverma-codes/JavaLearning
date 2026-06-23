package com.deepak.aiml;
import java.util.Scanner;

public class CH02_04_Practice {
    public static void main(String[] args) {
        // Ques 1
        float a = 7/4f * 9/2f;
        System.out.println(a);


        // Ques 2 ( WAP to encrypt grade by 8 and then decrypt it )
        char grade = 'C';
        grade = (char)(grade + 8);  // Encrypt
        System.out.println(grade);

        grade = (char)(grade - 8);  // Decrypt
        System.out.println(grade);


        // Ques 3 Check whether number enter by user is greater than given number.
        Scanner sc = new Scanner(System.in);
        float givenNum = 644.42f;
        System.out.print("Enter a number to compare with given number: ");
        float userInputNumber = sc.nextFloat();
        System.out.println(userInputNumber > givenNum);
    }
}
