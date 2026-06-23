package com.deepak.aiml;
import java.util.*;

public class CH09_05_Game {

        static Scanner sc = new Scanner(System.in);
        static void takeUserInput(){
        System.out.println("Guess the number: ");
        int userInput = sc.nextInt();
    }

    public static void main(String[] args) {
        Random random = new Random();
        int computerNumber = random.nextInt(1,101);

       // while (CH09_05_Game.userInput())

    }
}
