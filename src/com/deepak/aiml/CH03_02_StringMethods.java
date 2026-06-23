package com.deepak.aiml;
import java.util.Scanner;

public class CH03_02_StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "Deepak";

        // int len = name.length();
        // System.out.println(len);

        // System.out.println(name.toLowerCase());
        // System.out.println(name.toUpperCase());

        //String nonTrimmedString = "   DeePak   ";
        //System.out.println(nonTrimmedString.trim());

        // System.out.println(name.substring(1));  // eepak
        // System.out.println(name.substring(0,3));

        // System.out.println(name.replace('D','d'));  // Change D --> d
        // System.out.println(name.replace("Deepak", "Tanu"));
        // System.out.println(name.replace("e", "EE"));

        // System.out.println(name.startsWith("De"));
        // System.out.println(name.endsWith("pak"));

        // System.out.println(name.charAt(0));  // Return char at given index.

         // System.out.println(name.indexOf('e'));  // Return index of given char or string.
         // System.out.println(name.indexOf("ee"));

        // String newName = "Depakakak";
        // System.out.println(newName.indexOf("ak", 5));


        // System.out.println(name.equals("Deepak"));
        // System.out.println(name.equalsIgnoreCase("DeEpAk"));
        // System.out.println("Deepakk".equalsIgnoreCase(name));

        // Concat Strings
        // System.out.println("Enter First Name: ");
        // String firstName = sc.nextLine();
        // System.out.println("Enter Last Name: ");
        // String lastName = sc.nextLine();
        // System.out.println(firstName.concat(" ").concat(lastName));

        // System.out.println(name.contains("pak"));

        // System.out.println("   ".isBlank());


            // ESCAPE SEQUENCE CHARACTERS

        System.out.println("Hello, My name is \" Deepak verma");
        System.out.println("Hello im your  \\ new friend");
    }
}
