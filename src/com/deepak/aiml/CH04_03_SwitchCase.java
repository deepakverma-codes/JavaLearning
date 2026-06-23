package com.deepak.aiml;
import java.util.Scanner;

public class CH04_03_SwitchCase {
    public static void main(String[] args) {
        /* System.out.print("Enter a symbol from /, *. +, - : ");
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
                System.out.format("Substraction of %f and %f is  = %f ", num1, num2,num1 - num2);
                break;
            default:
                System.out.println("Use correct operator !");
        }   */


                   // Another way ( Enhanced switch )
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        switch (ch){
            case 'a' -> System.out.println("im A");
            case 'b'-> System.out.println("im B");
            default -> System.out.println("im other than a and b");

        }
    }
}
