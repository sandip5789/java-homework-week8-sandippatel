package homeworkweek8;

import java.util.Scanner;

/**
 * -Read the numbers from the console entered by the user and print the minimum
 *  and maximum number the user has entered.
 *  Created by Sandip Patel
 */

public class Programme_2_MinAndMaxInputChallenge {
    public static void main(String[] args) {
        // Declare the scanner
        Scanner scanner = new Scanner(System.in);
        // variables
        int min = Integer.MAX_VALUE; // get from the intellij
        int max = Integer.MIN_VALUE; // // get from intellij

        // Use an endless while loop
        while (true) {
            System.out.println("Enter number : ");
            if(scanner.hasNextInt()) {
                int number = scanner.nextInt();
                min = Math.min(min, number);
                max = Math.max(max, number);
            }else{
                break;
            }
        }
        System.out.println("Minimum number : " + (min == Integer.MAX_VALUE ? "N/A" : min));
        System.out.println("Maximum number : " + (max == Integer.MIN_VALUE ? "N/A" : max));
        scanner.close(); // closing the scanner object
    }
}
