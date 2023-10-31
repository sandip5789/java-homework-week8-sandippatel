package carpet_cost_calculator;

/**
 * Write a class with the name Calculator. The class needs two fields (instance variables) with name
 * floor of type Floor and carpet of type Carpet.
 * Created by Sandip Patel
 */

public class Calculator {
    // Instance variables
    Floor floor;
    Carpet carpet;

    // Declare constructor with parameter with return
    public Calculator(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet= carpet;

    }
    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}
