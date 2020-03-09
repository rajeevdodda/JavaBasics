package chapter4;

class Cup {
    Cup(int marker) {
        System.out.println("Cup (" + marker + ")");
    }

    void f(int marker) {
        System.out.println("f (" + marker + ")");
    }
}

class Cups {
    static Cup cup1;
    static Cup cup2;
    static String s = "rajeev";
    static String ss ;
    static String sss = "rahul";

    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
        ss = "dodda";
        sss="rahul_static";
    }

    Cups() {
        System.out.println("Cups");
    }
    static void staticBlock(){
        System.out.println(s+" "+ss+" "+sss);
    }
}

public class StaticBlock {
    // Even if we uncomment the blow line, the static block occurs only once.
    //static Cups cups1 = new Cups();
    public static void main(String[] args) {
        System.out.println("Inside main()");
        Cups.cup1.f(1);
        Cups.staticBlock();



    }

}
