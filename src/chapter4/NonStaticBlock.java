package chapter4;

class Mug {
    Mug(int marker) {
        System.out.println("Mug(" + marker + ")");
    }

    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

class Mugs {
    Mug mug1;
    Mug mug2;

    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("mug1 & mug2 initialized");
    }

    Mugs() {
        System.out.println("new Mugs");
    }

    Mugs(int i) {
        System.out.println("Mugs(" + i + ")");
    }
}

public class NonStaticBlock {
    public static void main(String[] args) {
        System.out.println("Inside main()");
        new Mugs();
        System.out.println("new Mugs() initialised");
        new Mugs(1);
        System.out.println("new Mugs(1) initialised");

    }
}
