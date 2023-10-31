package homeworkweek8;

/**
 * Java programme of Palindrome Number
 * Created by Sandip Patel
 *
 */

public class Programme_5_PalindromeNumber {
    // Declare the static method isPalindrome
    // methods need to return boolean
    public static boolean isPalindrome(int number){ // int parameter called
        //  Declare the variables
        int reverse = 0; // store the reverse of a number
        int originalNumber = number;

        while (number !=0){
            // Store the last digit so declare variable
            int lastDigit = number % 10; // lastDigit variable
            reverse = reverse * 10 + lastDigit; // increase place value
            number /= 10;

        }
        // method needs to return a boolean
        return originalNumber == reverse;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221)); // should return true
        System.out.println(isPalindrome(707)); // should return true
        System.out.println(isPalindrome(11212)); // should return false

    }
}
