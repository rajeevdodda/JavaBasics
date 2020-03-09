package chapter4;

public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            new Rock();
        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            new Rock(i);
        }
        System.out.println();
        Rock r = new Rock();
        System.out.println(r.s);

    }
}

class Rock {
    String  s;
    // Constructor doesnt have any return value.

    // Default Constructor
    Rock() {
        System.out.print("Rock ");
    }

    Rock(int i) {
        System.out.print("Rock" + i + " ");
    }

}