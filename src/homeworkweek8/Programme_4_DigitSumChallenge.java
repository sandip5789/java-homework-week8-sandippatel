package homeworkweek8;

import java.util.Scanner;

/**
 * Digit Sum Challenge
 *  Write a method with the name sumDigits that has one int parameter called number.
 *  If the parameter is >= 10 then the method should process the number and return sum of all digits,
 *  otherwise return-1 to indicate an invalid value.
 *  The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process
 *  negative numbers, so also return-1 for negative numbers.
 *  For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
 *  Calling the method sumDigits(1) should return-1 as per requirements described above.
 *  Add some code to the main method to test out the sumDigits method to determine that it is working
 *  correctly for valid and invalid values passed as arguments.
 *  Created by Sandip Patel
 */

public class Programme_4_DigitSumChallenge {
    public static void main(String[] args) {
        // Declare scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int digits = scanner.nextInt(); // call method
        System.out.println("The sum is " + sumDigits(digits));
        // Scanner object close
        scanner.close();

    }
    // declare static method
    public static int sumDigits(long n) {
        int result = 0;
        while(n > 0){
            result += n % 10;
            n /= 10;

        }
        return result;
    }
}
