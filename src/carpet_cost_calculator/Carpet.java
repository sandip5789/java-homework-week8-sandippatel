package carpet_cost_calculator;

/**
 *  Write a class with the name Carpet. The class needs one field (instance variable) with name cost of
 * type double.
 * Created by Sandip Patel
 */


public class Carpet {
    double cost; // variable

    // Declare constructor with parameter
    public Carpet (double cost) {
        if (cost < 0) {
            this.cost = 0;
        }else {
            this.cost = cost;

        }

    }
    public double getCost() {
        return cost;
    }

}
