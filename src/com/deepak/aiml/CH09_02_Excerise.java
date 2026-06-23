package com.deepak.aiml;
import java.util.*;

public class CH09_02_Excerise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            Random random = new Random();
            int computerChoice = random.nextInt(3);

            System.out.println("Enter 0 for ROCK" +
                    "\nEnter 1 for PAPER" +
                    "\nEnter 2 for scissor");
            int userChoice = sc.nextInt();


            ArrayList<String> list = new ArrayList<>(Arrays.asList("Rock", "Paper", "Scissor"));
            System.out.println(STR."You choose \{list.get(userChoice)}");

            if (computerChoice == 0) {
                System.out.println("Computer choose Rock");
            } else if (computerChoice == 1) {
                System.out.println("Computer choose Paper");
            } else {
                System.out.println("Computer choose Scissor");
            }

            if (userChoice == computerChoice) {
                System.out.println("Match Draw");
            } else if ((computerChoice == 0 && userChoice == 1) || (computerChoice == 1 && userChoice == 2) || (computerChoice == 2 && userChoice == 0)) {
                System.out.println("You WON !!");
            } else {
                System.out.println("Computer WON !");
            }
            System.out.println("press ctrl c to stop");
        }
    }
}
