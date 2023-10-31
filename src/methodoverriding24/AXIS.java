package methodoverriding24;

/**
 * Java Program to demonstrate the real scenario of Java Method Overriding
 * where three classes are overriding the method of a parent class
 * Creating child class
 */
// Created child class
//AXIS extends Bank // child extend parent
class AXIS extends Bank {
    public int getRateOfInterest(){
        return 9;
    }
}
