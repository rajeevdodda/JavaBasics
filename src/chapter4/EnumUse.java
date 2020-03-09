package chapter4;

// Enums are classes that have their own methods.

public class EnumUse {
    public static void main(String[] args) {
        // Enums cannot be initiated Spiciness()
        Spiciness spiciness = Spiciness.MEDIUM;
        System.out.println(spiciness);
        System.out.println(Spiciness.MEDIUM.toString());

        // static values method produces array of values of enum constants in the order they are declared.
        //ordinal gives declaration order
        for (Spiciness spiciness1 : Spiciness.values()) {
            System.out.println(spiciness1 + ", ordinal " + spiciness1.ordinal());

        }

        Burrito burrito = new Burrito(Spiciness.NOT);
        Burrito burrito1 = new Burrito(Spiciness.FLAMING);
        burrito.describe();
        burrito1.describe();

    }
}

enum Spiciness {
    NOT, MILD, MEDIUM, HOT, FLAMING
}

class Burrito {
    Spiciness degree;

    Burrito(Spiciness degree) {
        this.degree = degree;
    }

    void describe() {
        System.out.print("This burrito is ");
        switch (degree) {
            case NOT:
                System.out.println("not spicy at all.");
                break;
            case MILD:
            case MEDIUM:
                System.out.println("a little hot.");
                break;
            case HOT:
            case FLAMING:
                System.out.println("maybe too hot.");
                break;

        }

    }
}