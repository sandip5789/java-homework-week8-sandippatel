package pool_area;

/**
 * Write a class with the name Main that contains the main method.
 * The Swimming Company has asked you to write an application that calculates the volume of cuboid
 * shaped pools.
 * Created by Sandip Patel
 */

public class Main {
    // Write a class with the name Main that contains the main method.
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,10); // call Rectangle method
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5, 10, 5); // call Cuboid method
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());



    }

}
