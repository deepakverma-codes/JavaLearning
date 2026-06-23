package com.deepak.aiml;
import java.util.*;

public class CH05_01_WhileLoop {
    public static void main(String[] args) {
//        int i = 100;
//        while(i<201){
//            System.out.println(i);
//            i++;
//        }
        System.out.print("Enter a symbol from /, *. +, - : ");
        Scanner sc = new Scanner(System.in);
        String symbol = sc.next();

        System.out.print("Enter Number 1: ");
        float num1 =  sc.nextFloat();

        System.out.print("Enter Number 2: ");
        float num2 =  sc.nextFloat();

        switch (symbol){
            case "/":
                if(num2 == 0){
                    System.out.println("Division by 0 is not possible");
                }
                else{
                    System.out.format("Division of %f and %f is  = %f ", num1, num2, num1 / num2);
                }
                break;
            case "*":
                System.out.format("Multiplication of %f and %f is  = %f ", num1, num2,num1 * num2);
                break;
            case "+":
                System.out.format("Addition of %f and %f is  = %f ", num1, num2,num1 + num2);
                break;
            case "-":
                System.out.format("Substraction of %.2f and %.2f is  = %.2f ", num1, num2,num1 - num2);
                break;
            default:
                System.out.println("Use correct operator !");
        }

    }
}