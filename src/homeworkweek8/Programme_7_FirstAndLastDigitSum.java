package homeworkweek8;

import java.util.Scanner;

/**
 * Write a Java programme of First and Last Digit Sum.
 * Created by Sandip Patel
 */

public class Programme_7_FirstAndLastDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int sumFirstAndLastDigit = scanner.nextInt();
        // print below as need example output
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
        scanner.close(); // scanner object close

    }

    // Declare static method  sumFirstAndLastDigit
    public static int sumFirstAndLastDigit(int number) { // int called number
        if (number < 0) {
            return -1; // If the number is negative = less then 0
        }
        if (number < 10) {
            return number * 2; // return double number for single digit input
        }
        int lastDigit = number % 10;
        while (number >= 10) {
            number /= 10;
        }
        int firstDigit = number;
        return firstDigit + lastDigit;
    }
}
