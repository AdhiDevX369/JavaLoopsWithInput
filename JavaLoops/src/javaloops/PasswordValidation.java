/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaloops;

/**
 *
 * @author dammi
 */
import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean validPassword = false;

        while (!validPassword) {
            // ask the user for a password
            System.out.print("Enter a password: ");
            String password = input.nextLine();

            // check if the password meets the criteria
            if (password.length() < 8) {
                System.out.println("Password must be at least 8 characters long.");
            } else {
                boolean hasUppercase = false;
                boolean hasNumber = false;

                for (int i = 0; i < password.length(); i++) {
                    char ch = password.charAt(i);
                    if (Character.isUpperCase(ch)) {
                        hasUppercase = true;
                    } else if (Character.isDigit(ch)) {
                        hasNumber = true;
                    }
                }

                if (!hasUppercase) {
                    System.out.println("Password must contain at least one uppercase letter.");
                } else if (!hasNumber) {
                    System.out.println("Password must contain at least one number.");
                } else {
                    System.out.println("Password is valid.");
                    validPassword = true;
                }
            }
        }

        input.close(); // remember to close the scanner object
    }
}
