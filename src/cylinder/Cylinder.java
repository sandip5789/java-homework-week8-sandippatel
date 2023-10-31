package cylinder;

/**
 * Write a class with the name Cylinder that extends Circle class. The class needs one field ( Instance Variable)
 * with the name height of type double.
 * Created by Sandip Patel
 */

// Extended Cylinder class with Circle
public class Cylinder extends Circle {
    double height;

    // Class with constructor with two parameter
    public  Cylinder (double radius, double height){

        // Call the parent constructor from circle
        super(radius);
        if (height < 0) {
            this.height = 0;
        }else {
            this.height = height;
        }

    }
    // Declare method getHeight without parameter
    public double getHeight() {
        return this.height;

    }
    // Declare method getVolume without parameter
    public double getVolume (){
        return height * getArea();
    }
}
