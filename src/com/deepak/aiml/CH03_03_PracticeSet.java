package com.deepak.aiml;
import java.util.Scanner;

public class CH03_03_PracticeSet {
    public static void main(String[] args) {
        // Ques 1 convert string to lowercase
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String input = sc.nextLine();
        System.out.printf("Your %s in lowercase will be : ", input);
        System.out.println(input.toLowerCase());

        // Ques 2 replace space with underscore.
        String space = "   D   ee pa   k   ";
        System.out.println(space.replace("", "_"));

        // Ques 3
        String letter = "Dear <|name|> Thanks a lot";
        System.out.println(letter.replace("<|name|>", "Deepak"));

        // Ques 4
        String name = "De   e pak  ";
        System.out.println(name.contains("  "));
        System.out.println(name.contains("   "));


    }
}
