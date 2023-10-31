package cylinder;

/**
 *  Write a class with the name Circle. The class needs one field (instance variable) with name radius of
 * type double.
 * Crated by Sandip Patel
 *
 */

public class Circle {
    // Declare Instance method with name radius of type double
    double radius;

    // Declare constructor with parameter
    public  Circle (double radius) {

        // Initialize the fields
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }
        // Declare Method
        public double getRadius() {
            return this.radius;
        }
        public double getArea(){
            return radius * radius * Math.PI;
        }
    }

