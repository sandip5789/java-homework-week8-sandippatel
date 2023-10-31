package homeworkweek8;

import java.util.Scanner;

/**
 * Write a programme to in put any number and check if it Armstrong number or not
 *  153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 * Created by Sandip Patel
 */

public class Programme_10_ArmstrongNumber {
    public static void main(String[] args) {
        // Declare scanner object
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scanner.nextInt(); // call method in scanner
        scanner.close(); // scanner object close

        // use boolean for value is true or false
        if (isArmstrongNumber(number)) {
            System.out.println(number + " is Armstrong number ");
        }else{
            System.out.println(number + " is not Armstrong number ");
        }

    }
    // Declare static method isArmstrongNumber
    public static boolean isArmstrongNumber(int number){
        int originalNumber = number;
        int sum = 0;
        while (number > 0){
            int digit = number % 10;
            sum += Math.pow(digit, 3);//use Math from IntelliJ and use digit and number 3 to change
            number /= 10;
        }
        return  sum == originalNumber;
    }
}

