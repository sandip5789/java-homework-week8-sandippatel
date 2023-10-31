package multilevelinheritance22;

/**
 * Forth class
 */

class TestInheritance {
    public static void main(String args[]){
        BabyDog d = new BabyDog(); // call BabyDog method
        d.weep(); // BabyDog print first weeping...
        d.bark(); // Dog print second barking...
        d.eat(); // Animal print third eating...
    }
}
