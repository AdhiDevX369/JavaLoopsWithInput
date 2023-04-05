package javaloops;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = 0;

        while (n <= 0) {
            System.out.print("Enter a positive integer: ");
            if (input.hasNextInt()) {
                n = input.nextInt();
                if (n <= 0) {
                    System.out.println("The number must be positive.");
                }
            } else {
                input.next();
                System.out.println("Invalid input. Please enter a positive integer.");
            }
        }

        int prev = 0;
        int current = 1;
        int fib;

        System.out.print("The first " + n + " numbers in the Fibonacci sequence are: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(prev + " ");
            fib = prev + current;
            prev = current;
            current = fib;
        }

        input.close();
    }
}
