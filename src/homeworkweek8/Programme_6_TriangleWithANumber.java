package homeworkweek8;

import java.util.Scanner;

/**
 *Write a programme in Java to display the pattern like a triangle with a number.
 * Fo reg.
 * Input number of rows:10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 * Created by Sandip Patel
 */

public class Programme_6_TriangleWithANumber {



        public static void main(String[] args) {
            // Declare scanner object
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input number of rows : ");
            int numRows = scanner.nextInt(); // call method numRows
            // Scanner object close
            scanner.close();

            // Declare for loop
            for (int i = 1; i <= numRows; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j); // call j method
                }
                System.out.println("");
            }
        }
    }




