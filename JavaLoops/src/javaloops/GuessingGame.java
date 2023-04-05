/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaloops;

import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1; // generate a random number between 1 and 100
        int guess = 0;
        int numGuesses = 0;

        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");

        while (guess != randomNumber) {
            System.out.print("Enter your guess (1-100): ");
            if (input.hasNextInt()) {
                guess = input.nextInt();
                if (guess < 1 || guess > 100) {
                    System.out.println("Invalid input. Guesses must be between 1 and 100.");
                    continue;
                }
            } else {
                System.out.println("Invalid input. Please enter an integer between 1 and 100.");
                input.next();
                continue;
            }
            numGuesses++;

            if (guess < randomNumber) {
                System.out.println("Too low. Guess again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high. Guess again.");
            }
        }

        System.out.println("Congratulations! You guessed the number in " + numGuesses + " guesses.");
        input.close(); // remember to close the scanner object
    }
}
2