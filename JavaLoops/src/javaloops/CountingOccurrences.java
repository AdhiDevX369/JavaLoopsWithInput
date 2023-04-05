/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaloops;

import java.util.Scanner;

public class CountingOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ask the user for a string and a character
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        System.out.print("Enter a character: ");
        String charStr = input.next();

        // validate the input
        if (charStr.length() != 1) {
            System.out.println("Invalid input. Please enter only one character.");
            input.close();
            return;
        }
        char ch = charStr.charAt(0);

        // initialize a variable to count the occurrences of the character
        int count = 0;

        // loop through the string and count the occurrences of the character
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        // print the count of occurrences
        System.out.println("The character " + ch + " occurs " + count + " times in the string.");
        
        input.close(); // remember to close the scanner object
    }
}
