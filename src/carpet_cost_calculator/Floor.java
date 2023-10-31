package carpet_cost_calculator;

/**
 *  Write a class with the name Floor. The class needs two fields (instance variables) with name width
 * and length of type double.
 * Created by Sandip Patel
 */

public class Floor {
    // Instance variables
    double width;
    double length;

    // constructor with parameters
    public Floor (double width, double length){
        // Initialize fields
        if (width < 0) {
            this.width = 0;
        }else{
            this.width = width;
        }
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }
    // Declare Instance method
    public double getArea (){
        return width * length;
    }
}
