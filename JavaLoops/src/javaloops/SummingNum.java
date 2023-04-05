package javaloops;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
public class SummingNum {
     public static void main(String[] args) {
      Scanner Number = new Scanner(System.in);
        
        System.out.print("Enter a series of numbers (separated by spaces): ");
        String inputStr = Number.nextLine();
        
        // validate the input
        if (inputStr.isEmpty() || !inputStr.matches("^\\s*\\d+(\\s+\\d+)*\\s*$")) {
            System.out.println("Invalid input. Please enter only numbers separated by spaces.");
            Number.close();
            return;
        }
        
        // split the input string into individual numbers
        String[] numbersArr = inputStr.split(" ");
        
        // calculate the sum of the numbers
        int sum = 0;
        for (String numStr : numbersArr) {
            sum += Integer.parseInt(numStr);
        }
        
        System.out.println("The sum of the numbers is: " + sum);
        
        Number.close();
    }
}