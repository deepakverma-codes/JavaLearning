package com.deepak.aiml;
import java.util.Scanner;

public class CH03_01_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String name = sc.next();  // Print only first word
        String name = sc.nextLine(); // Print whole sentence
        System.out.println(name);

        // Format Specifier
        int a = 66;
        float b = 7236.23f;
        System.out.format("Value of a is %d and value of b is %.2f", a, b); // %f, %s are known as Format Specifier.

        // Two Ways to write string

        String Way1 = "hi Deepak";
        String Way2 = new String("hi deepak");  // Consume more space so dont use
    }
}
