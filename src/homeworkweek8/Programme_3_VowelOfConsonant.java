package homeworkweek8;

import java.util.Scanner;

/**
 * Write a Java programme that takes the user to provide a single character from the alphabet.
 * Print Vowel of Consonant, depending on the user input. If the user input
 *  Is not a letter (between a and z or A andZ),or is a string of length>1,print an error message.
 *  For eg:
 *  Input an alphabet: p
 *  Expected Output:
 *  Input letter is Consonant
 */

public class Programme_3_VowelOfConsonant {
    public static void main(String[] args) {
        // Declare scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a single character from the alphabet : ");
        String input = scanner.nextLine();
        // Using if else condition
        if (input.length() == 1 && input.matches("[a-zA-Z]")){
            // The charAt() method returns the character at the specified index in a string
            char character = input.toLowerCase().charAt(0);

            if (character == 'a' || character == 'e' || character == 'o' || character == 'u' ) {
                System.out.println("Input letter is a Vowel");
            }else {
                System.out.println("Input letter is a Consonant");
            }
            }else {
                System.out.println("Error message: Please enter a single alphabetical character (a-z or A-Z). ");
            }
         // Scanner object close
        scanner.close();
        }
    }





