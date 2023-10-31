package homeworkweek8;

/**
 * Display right angle triangle of @ using nested for loops
 *  @
 *  @@
 *  @@@
 *  @@@@
 *  @@@@
 *  Created by Sandip Patel
 */

public class Programme_8_RightAngleTriangle {
    public static void main(String[] args) {
        int rows = 5; // Can change as per height of the triangle require
      // Declare For Loop
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println(); // if you don't sout this  Move to the next line for the next row
        }
    }
}
