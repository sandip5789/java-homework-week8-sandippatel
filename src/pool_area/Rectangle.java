package pool_area;

/**
 * Write a class with the name Rectangle. The class needs two fields (Instance variable) with name
 * width and length both of type double.
 * Created by Sandip Patel
 */

public class Rectangle {
    // Declare two Instance variables type double
    double width;
    double length;

    // Declare constructor with parameter
    public Rectangle(double width, double length) {

        // Initialize the fields
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (length < 0) {
            this.length = length;
        } else {
            this.length = length;
        }
    }

    // Declare Instance method
    // Method named getWidth without any parameters, it needs to return the value of the width field.
    public double getWidth() {
        return this.width;
    }

    // Method named getLength without any parameters, it needs to return the value of the length field
    public double getLength() {
        return this.length;
    }

    // Method named getArea without any parameters, it needs to return the calculated area (width * length)
    public double getArea() {
        return width * length;
    }

}


