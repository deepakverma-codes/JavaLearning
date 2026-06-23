package com.deepak.aiml;
import java.util.Scanner;

public class CH04_02_elseif {
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        // if - elseif - else ladder

        if (age > 60){
            System.out.println("You are experienced");
        }
        else if(age > 45){
            System.out.println("You are less experienced");
        }
        else if (age > 30){
            System.out.println("You are least experienced");
        }
        else if (age <= 0){
            System.out.println("Age cant be 0 or negative !");
        }
        else {
            System.out.println("You are not eligible");
        }
    }
}
