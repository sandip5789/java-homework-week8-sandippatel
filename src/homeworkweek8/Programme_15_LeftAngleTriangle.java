package homeworkweek8;

import java.util.Scanner;
/**
 *  Display left angle triangle of * using nested for loops
 *  Created by Sandip Patel
 */
public class Programme_15_LeftAngleTriangle {

        public static void main(String[] args) {
            // Declare the Scanner object
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of rows: ");
            int numRows = scanner.nextInt(); // call method via scanner numRows is method

            // Outer loop for the number of rows
            for (int i = 1; i <= numRows; i++) {
                // Inner loop to print * (asterisks) in each row
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                // Move to the next line after each row
                System.out.println();
            }
            // Scanner object close
            scanner.close();
        }
    }



