package homeworkweek8;

/**
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 *  The method should return the sum of the even digits within the number.
 *  If the number is negative, the method should return-1 to indicate an invalid value.
 *  Created by Sandip Patel
 *
 */

public class Programme_11_EvenDigitSum {
    public static void main(String[] args) {
        int number1 = 123456789;
        int number2 = 252;
        int number3 = -22;
        System.out.println("getEvenDigitSum(" + number1 + ")  + " + getEvenDigitSum(number1) );
        System.out.println("getEvenDigitSum(" + number2 + ")  + " + getEvenDigitSum(number2) );
        System.out.println("getEvenDigitSum(" + number3 + ")  + " + getEvenDigitSum(number3) );

    }
    // Declare getEvenDigit static method
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1; // Invalid value, negative number
        }
        int sum = 0;
        while (number > 0) {
            int digit = number % 10; // get the last digit
            if (digit % 2 == 0) { // check if the digit is even
                sum += digit;
            }
            number /= 10; // Move to next digit

        }
        return sum; // return value for sum

    }
}
