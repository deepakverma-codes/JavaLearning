package com.deepak.aiml;
import java.util.*;

public class CH04_04_PracticeSet {
    public static void main(String[] args) {

        /* Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of Hindi: ");
        double marksHindi = sc.nextDouble();
        System.out.print("Enter marks of English: ");
        double marksEnglish = sc.nextDouble();
        System.out.print("Enter marks of Maths: ");
        double marksMaths = sc.nextDouble();
        double totalMarks = marksHindi + marksEnglish + marksMaths;
        double percentage = (totalMarks*100)/300;

        if(marksHindi>100 || marksEnglish>100 || marksMaths>100 || marksHindi<0 || marksEnglish<0 || marksMaths<0){
            System.out.println("Error ! Enter number from 0-100");
            return;
        }
        else if (percentage>=40 && marksHindi>=33 && marksEnglish>=33 && marksMaths>=33){
            System.out.println("You are pass");
        }
        else{
            System.out.println("You are fail");
        }
        System.out.format("Your total percentage is = %.2f", percentage); */


        // ques 2
        /* Scanner sc = new Scanner(System.in);
        System.out.print("Enter number from 1-7: ");
        int num = sc.nextInt();
        if (num < 1 || num > 7) {
            System.out.println("Enter a valid input");
        } else {
            switch (num) {
                case 1 -> System.out.println("Today is Monday");
                case 2 -> System.out.println("Today is Tuesday");
                case 3 -> System.out.println("Today is Wednesday");
                case 4 -> System.out.println("Today is Thursday");
                case 5 -> System.out.println("Today is Friday");
                case 6 -> System.out.println("Today is Saturday");
                case 7 -> System.out.println("Today is Sunday");
            }
        } */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income: ");
        double income = sc.nextDouble();

        if(income<0 || income>1000000000){
            System.out.println("Invalid income !!");
        }
        else if(income < 250000){
            System.out.println("you will pay 0 rupee tax");
        }
        else if (income > 250000 && income < 500000){
            double tax = (income * 5)/100;
            System.out.println("Your payable tax = " + tax);
        }
        else if (income > 500000 && income < 1000000){
            double tax = (income * 20)/100;
            System.out.println("Your payable tax = " + tax);
        }
        else {
            double tax = (income * 30)/100;
            System.out.println("Your payable tax = " + tax);
        }

        // Ques 4 Leap year
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc1.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("This is a leap year");
        }
        else {
            System.out.println("Entered year is not a leap year");
        }

       // ques 5 (by use of .endswith method of string)
    }
}
