package pool_area;

/**
 * Write a class with the name Cuboid that extends Rectangle class. The class needs one field (Instance
 * variable) with name height of type double.
 * Created by Sandip Patel
 */
// Cuboid extends Rectangle
public class Cuboid extends Rectangle {
    double height;

    // Declare constructor with three parameter
    // Constructor always has parameter
    // Name is same as class name
    public Cuboid(double width, double length, double height) {

        // call parent constructor from Rectangle
        super(width, length);

        // Initialize  height
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // Method named getHeight without any parameters, it needs to return the value of height field
    public double getHeight() {
        return this.height;
    }

    // Method named getVolume without any parameters, it needs to return the calculated volume.
    //To calculate volume, multiply the area with height.
    public double getVolume() {
        return getArea() * height;
    }
}



