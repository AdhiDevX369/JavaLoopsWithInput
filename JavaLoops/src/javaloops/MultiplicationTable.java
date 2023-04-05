/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaloops;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        
        while (true) {
            System.out.print("Enter a positive integer: ");
            if (input.hasNextInt()) {
                number = input.nextInt();
                if (number > 0) {
                    break;
                }
            }
            input.nextLine();
            System.out.println("Invalid input. Please enter a positive integer.");
        }
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
