package homeworkweek8;

import java.util.Scanner;

/**
 * Write a programme to input any number and check if it is prime or not.
 * Created by Sandip Patel
 */

public class Programme_12_PrimeNumber {
    public static void main(String[] args) {
        // Declare variables
        int n = 2;
        int result = 0;
        int number = 0;
        // Declare scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :"); // ask from user
        number = scanner.nextInt(); // use method number
        scanner.close(); // scanner object close
        while (n <= number / 2){
            if (number % n ==0){
                result = 1;

            }
            n++;
        }
        if (result == 1){
            System.out.println("Number : " + number + " is Not Prime");

        }else{
            System.out.println("Number : " + number + " is Prime");
        }
    }
}
