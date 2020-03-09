package chapter4;

class A {

}

public class VariableArguments {
    public static void main(String[] args) {
        printArray(new Object[]{new Integer(1), new Integer(2)});
        printArray((new Object[]{1, "one"}));

        // default it prints chapter4.A@72ea2f77 ==> packageName.class@hexcode(if you dont define toString in class)
        printArray(new Object[]{new A(), new A()});
        printArray2(new Object[]{new A(), new A()});
        printArray2(1, 2, 4);
        f(1, "one", "two");
        f(1);
        g(new Integer(9));
        g(1, 2, 3);
        g();
        f1('1', 'b');
        f1();
        System.out.println();
        System.out.println("int[] :"+ new int[10].getClass());
    }

    static void printArray(Object[] args) {
        for (Object object : args) {
            System.out.print(object + " ");
        }
        System.out.println();
    }

    // we can use ellipses also
    static void printArray2(Object... args) {
        for (Object object : args) {
            System.out.print(object + " ");
        }
        System.out.println();
    }

    static void f(int required, String... trailing) {
        System.out.print("required :" + required + " ");
        for (String s : trailing) {
            System.out.print(s + " ");
        }
        System.out.println(";");

    }
    static void f1(Character... characters){
        // getClass() is part og Object
        // '[' indicated its an array, '[I' is for primitive int
        System.out.print(characters.getClass()+ " length "+ characters.length+ " ;");
    }
    static void g(Integer... integers){
        System.out.print(integers.getClass()+ " length "+ integers.length+ " ;");
    }

}
