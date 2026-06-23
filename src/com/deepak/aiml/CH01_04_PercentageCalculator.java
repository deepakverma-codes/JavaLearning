package com.deepak.aiml;
import java.util.Scanner;

public class CH01_04_PercentageCalculator {
  public static void main(String[] args) {
//      percentage calc for 5 subject
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter Number of maths:");
      float marks_maths = sc.nextFloat();

      System.out.println("Enter Number of science:");
      float marks_science = sc.nextFloat();

      System.out.println("Enter Number of hindi:");
      float marks_hindi = sc.nextFloat();

      System.out.println("Enter Number of english:");
      float marks_english = sc.nextFloat();

      System.out.println("Enter Number of yoga:");
      float marks_yoga = sc.nextFloat();

      float sum = marks_english + marks_hindi + marks_yoga + marks_maths + marks_science;
      System.out.printf("You got %.2f out of 500\n", sum);

      float percentage = (sum*100)/500;
      System.out.printf("You got %.2f percentage in class 10th" , percentage);

      sc.close();
    }
}
