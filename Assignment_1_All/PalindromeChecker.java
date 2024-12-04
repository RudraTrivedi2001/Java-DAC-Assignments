package Assignment_1_All;

import java.util.Scanner;

//Q8 palindrome checker

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a string to check for palindrome: ");
        String input = scanner.nextLine();

        // Convert the string to lowercase to make it case-insensitive
        String lowerCaseInput = input.toLowerCase();

        // Reverse the string
        String reversed = "";
        for (int i = lowerCaseInput.length() - 1; i >= 0; i--) {
            reversed += lowerCaseInput.charAt(i);
        }

        // Check if the original and reversed strings are the same
        if (lowerCaseInput.equals(reversed)) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }
}
