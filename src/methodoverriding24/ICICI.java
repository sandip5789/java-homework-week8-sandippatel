package methodoverriding24;

/**
 * Java Program to demonstrate the real scenario of Java Method Overriding
 *  where three classes are overriding the method of a parent class
 *  Creating child class
 */
// Created child class
//ICICI extends Bank // child extend parent
class ICICI extends Bank {
    public int getRateOfInterest(){
        return 7;
    }

}
