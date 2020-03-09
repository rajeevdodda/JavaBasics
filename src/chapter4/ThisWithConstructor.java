package chapter4;

public class ThisWithConstructor {
    public static void main(String[] args) {
        new Flower().printPetalsCount();

    }

}

class Flower {
    int petalCount = 0;
    String s = "initial value";

    Flower() {
        this("hi", 78);
        System.out.println("default constructor with no args ");

    }

    Flower(int petals) {
        petalCount = petals;
        System.out.println("Constructor with int arg only, petalCount = " + petalCount);
    }

    Flower(String ss) {
        s = ss;
        System.out.println("Constructor with string arg only, s = " + s);
    }

    Flower(String s, int petals) {
        this(petals);
        //! this(s); can't call two!
        // another use of "this" keyword.
        this.s = s;

        System.out.println("string and int args");

    }

    void printPetalsCount() {
        // this(11) not inside non constructor

        System.out.println("petalsCount = " + petalCount + " string = " + s);
    }

}