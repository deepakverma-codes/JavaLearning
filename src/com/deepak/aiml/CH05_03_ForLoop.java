package com.deepak.aiml;
import java.util.Scanner;

public class CH05_03_ForLoop {
    public static void main(String[] args) {
//        // First n even number
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number up to which you want even number:  ");
//        int n = sc.nextInt();
//        for(int i = 1; i<=n; i++){
//            System.out.println(2*i);
//        }

        // First n odd number
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number up to which you want even number:  ");
//        int n1 = sc.nextInt();
//        for(int i = 0; i<=n1; i++){
//            System.out.println(2*i+1);
//        }

        // Natural number in reverse order
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:  ");
        int n2 = sc.nextInt();
        for (int i = n2; i>0; i--){
            System.out.println("*".repeat(i));
        }
    }
}
