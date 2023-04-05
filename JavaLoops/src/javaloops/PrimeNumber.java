/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaloops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = 0;

        while (number <= 0) {
            System.out.print("Enter a positive integer: ");
            if (input.hasNextInt()) {
                number = input.nextInt();
                if (number <= 0) {
                    System.out.println("The number must be positive.");
                }
            } else {
                input.next();
                System.out.println("Invalid input. Please enter a positive integer.");
            }
        }

        boolean isPrime = true;

        if (number < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        input.close();
    }
}
