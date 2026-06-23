package com.deepak.aiml;
import java.util.Scanner;

public class CH04_01_Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age>18){
            System.out.println("You are adult");
        }
        else{
            System.out.println("you are not a adult");
        }
    }
}
