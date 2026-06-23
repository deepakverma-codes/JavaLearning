package com.deepak.aiml;
import java.util.Scanner;

public class CH05_02_DoWhile {
    public static void main(String[] args) {
        // First n natural number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number: ");
        int natural = sc.nextInt();
        int a = 1;
        System.out.print("Natural number : ");
        do{
            System.out.println(a);
            a++;
        } while(a<=natural);
    }
}
