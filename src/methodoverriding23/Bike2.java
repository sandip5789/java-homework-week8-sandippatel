package methodoverriding23;

/**
 * Overriding parent class
 * Creating a child class
 */
 // Creating a child class and extends Vehicle
class Bike2 extends Vehicle {
    // defining the same method as in the parent class
    public void run(){
        System.out.println("Bike is running safely");
    }
    // Declare main method
    public static void main(String args[]){
        Bike2 obj = new Bike2(); // crating object
        obj.run(); // calling method
    }

}
