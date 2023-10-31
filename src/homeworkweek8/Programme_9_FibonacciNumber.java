package homeworkweek8;

import java.util.Scanner;

/**
 *  Print the sequence 1 123581321(Fibonacci number)
 *  Created by Sandip Patel
 */

public class Programme_9_FibonacciNumber {
    public static void main(String[] args) {
        // Declare Scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of term in the Fibonacci sequence : ");
        int n= scanner.nextInt(); // Call scanner method int n

        int a = 1;
        int b = 1;


        if (n >= 1) {
            System.out.println(a + " ");
        }
                if (n >= 2) {
                    System.out.println(b + " ");

                }
                for (int i = 3; i <= n; i++){
                    int c = a + b;
                    System.out.println(c + " ");
                    a = b;
                    b = c;
                }
                // Scanner object close
                scanner.close();
            }


            }





