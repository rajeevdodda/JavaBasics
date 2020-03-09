package chapter4;


public class StaticData {
    int i;
    static int j;

    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();

    public static void main(String[] args) {
        // non -static data cannot be referenced form static content
        //System.out.println(i);
        System.out.println("static data used inside static content " + j);
        StaticData staticData = new StaticData();
        staticData.f();
        System.out.println("Creating new cupboard in main:");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);


    }

    void f() {
        System.out.println("static data used inside non static content " + j);
        System.out.println("non static data used inside non static content " + i);
    }
}

class Bowl {
    Bowl(int marker) {
        System.out.println("Bowl (" + marker + ")");
    }

    void f1(int marker) {
        System.out.println("f1 (" + marker + ")");
    }
}

class Table {
    // static initialisation occurs only once when table object is created initially.
    static Bowl bowl1 = new Bowl(1);
    static Bowl bowl2 = new Bowl(2);

    Table() {
        System.out.println("Table ()");
        bowl2.f1(1);
    }

    void f2(int marker) {

        System.out.println("f1 (" + marker + ")");
    }
}

class Cupboard {
    // whenever an object is created, first all the static content are initialised.
    Bowl bowl3 = new Bowl(3);
    // static
    static Bowl bowl4 = new Bowl(4);
    static Bowl bowl5 = new Bowl(5);


    Cupboard() {
        System.out.println("Cupboard ()");
        bowl4.f1(2);
    }

    void f3(int marker) {
        System.out.println("f3 (" + marker + ")");
    }

}