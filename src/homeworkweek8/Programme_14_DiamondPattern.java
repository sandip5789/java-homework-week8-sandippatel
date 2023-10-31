package homeworkweek8;

/**
 * Write a programme in Java to display the pattern like a diamond.
 * Use While loop method
 * Created by Sandip Patel
 */

public class Programme_14_DiamondPattern {
    public static void main(String[] args) {
        // Declare variables
        int number = 7; // 7 because after 7 line start decrease max=7
        int m = 1; // Diamond start with single star so 1
        int n; // for shape -shaped like a column - Columnar printing

                do { // print the first half diamond
                    n = 1;

                    // Inner loop 1
                    // Prints space until ++n <= number - m + 1 is
                    // false
                    do {
                        System.out.print(" "); // Print whitespace between * space *
                    }

                    // Condition for inside do-while loop 1
                    while (++n <= number - m + 1);
                    n = 1;
                    // Inner loop 2
                    // Prints star until ++n <= m * 2 - 1 is false
                    do {
                        System.out.print("*"); // Print star
                    }
                    // Condition for inner do-while loop 2
                    while (++n <= m * 2 - 1);
                    // A new row requires a new line
                    System.out.println();

                }

                // Condition for outer do-while loop 1
                while (++m <= number);

                // Now we are done with printing the upper half diamond.
                m = number - 1;  // initialized should one lesser than number
                // Outer loop 2
                // Prints the second half diamond
                do {
                    n = 1;
                    // Inner loop 1
                    // Prints space until ++n <= number - m + 1 is
                    // false
                    do {
                        // Print whitespace between
                        System.out.print(" ");
                    } while (++n <= number - m + 1);
                    n = 1;
                    // Inner loop 2
                    // Prints star until ++n <= m * 2 - 1 is false
                    do {
                        // Prints star
                        System.out.print("*");

                    } while (++n <= m * 2 - 1);

                    // By now done with one row of lower diamond
                    // printing so a new line is required
                    System.out.println();
                }
                // Condition for outer do-while loop 2
                while (--m > 0);
            }
        }

