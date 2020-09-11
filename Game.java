package guesser;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("Welcome to The Guesser.");
//        System.out.println("Please enter your desired username.");
        Scanner input = new Scanner(System.in);
//        String userName = input.next();
//        System.out.println("Hello " + userName + ", you will have to guess a number from 0 to 20 in 5 attempts.");
        System.out.println("Would you like to start the game?");
        System.out.println("Press 1 to continue");
        System.out.println("Press 0 to exit");
        int choice = input.nextInt();
        while (choice != 1 && choice != 0) {
            System.out.println("Wrong input. Please try again.");
            choice = input.nextInt();
        }
        if (choice == 1) {
            Random random = new Random();
            int number  = random.nextInt(21);
            System.out.println("Number has been generated so guess it.");
            int guess  = input.nextInt();
            for (int i = 0; i < 4; i++) {
                if (guess == number) {
                    System.out.println("Bravo, you got the number right.");
                    break;
                } else {
                    if (number > guess) {
                        System.out.println("Hint: Guess a number greater than the previous.");
                    } else {
                        System.out.println("Hint: Guess a number lower than the previous.");
                    }
                    System.out.println("Now try again.");
                    guess = input.nextInt();
                }
            }
            if (guess != number) {
                System.out.println("Game Over.You are out of chances.The right number was " + number);
            }
        }else {
            System.out.println("Bye.");
        }

    }
}
