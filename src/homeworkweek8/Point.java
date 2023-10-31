package homeworkweek8;

/**
 * Write a programme Point
 * Created by Sandip Patel
 */

public class Point {
    int x; // instance variable
    int y; // instance variable

    // Declare constructor without parameter
    public Point() {

    }

    // Declare constructor with parameter
    public Point(int x, int y) {
        this.x = x; // initialize the field
        this.y = y;

    }
// Declare getX without any parameter with return x
    public int getX() {
        return x;
    }
// Declare getY without any parameter with return y
    public int getY() {
        return y;
    }
    // Declare setX with one parameter type int and value x
    public void setX(int x){
        this.x = x;

    }
    // Declare setY with one parameter type int and value y
    public void setY(int y){
        this.y = y;

    }
    // Declare distance method without parameter with return
    public double distance (){
        return Math.sqrt((x * x) + (y * y));
    }
    // Declare distance with two parameters x, y and int type
    public double distance (int x, int y){
        return Math.sqrt((this.x - x) * (this.x -x) + (this.y - y) * (this.y - y));
    }
    // Declare distance with parameter another type of point
    public double distance (Point point){
        return Math.sqrt((this.x - point.getX()) * (this.x -point.getX()) + (this.y - point.getY()) * (this.y - point.getY()));
    }

    // Declare main method
    public static void main(String[] args) {
        Point first = new Point(6,5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());




    }
}
