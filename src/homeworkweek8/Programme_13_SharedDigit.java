package homeworkweek8;

import java.util.Scanner;

/**
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 * Created by Sandip Patel
 */
public class Programme_13_SharedDigit {


        public static void main(String[] args) {
            // Declare scanner object
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter two numbers within the range of 10-99:");
            int num1 = scanner.nextInt(); // call method num1 via scanner
            int num2 = scanner.nextInt(); // call method num2 via scanner

            if (hasSharedDigit(num1, num2)) {
                System.out.println("The numbers have a shared digit.");
            } else {
                System.out.println("The numbers do not have a shared digit or are out of the specified range.");
            }
            // Scanner object close
            scanner.close();
        }
        // Declare method hasSharedDigit with two parameter and type int
        public static boolean hasSharedDigit(int num1, int num2) {
            if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
                return false;
            }

            int num1Digit1 = num1 % 10;
            int num1Digit2 = num1 / 10;
            int num2Digit1 = num2 % 10;
            int num2Digit2 = num2 / 10;

            // return with parameter
            return (num1Digit1 == num2Digit1 || num1Digit1 == num2Digit2 || num1Digit2 == num2Digit1 || num1Digit2 == num2Digit2);
        }
    }




