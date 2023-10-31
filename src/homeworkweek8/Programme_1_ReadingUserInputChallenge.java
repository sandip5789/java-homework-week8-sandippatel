package homeworkweek8;

import java.util.Scanner;

/**
 *  Read 10 numbers from the console entered by the user and print the sum of those numbers.
 *  Created by Sandip Patel
 */

public class Programme_1_ReadingUserInputChallenge {
    public static void main(String[] args) {
        // Declare scanner to get user reading
        Scanner scanner = new Scanner(System.in);
        int count = 1; // variables counting
        int sum = 0; // variables counting

        // use a while loop method

        while (count <=10){
            System.out.println("Enter number # " + count + ": ");
            if(scanner.hasNext()) {
                int number = scanner.nextInt(); // scanner to print nextline
                sum += number;
                count++;
            }else{
                System.out.println("Invalid Number");
                scanner.nextLine();

            }
        }
        System.out.println("Sum of the 10 number is: " + sum);
        // closing the scanner object
        scanner.close();
        }

        }
