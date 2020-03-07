package chapter3;

public class ControllingExecution {
    public static void main(String[] args) {
        while (condition()) {
            System.out.println("In side while loop");
        }
        System.out.println("Outside while loop");
        char c = 97;
        System.out.println(c);
        commaOperator();

        float[] f = new float[10];
        for (int i = 0; i < 10; i++) {
            f[i] = (float) Math.random();
        }


        // foreach loop for iteration containers, it also works with any object that is "Iterable".
        for (float x : f) {
            System.out.println(x);
        }

        for (char y : "Hello World".toCharArray()) {
            System.out.print(y + " ");
        }
    }

    static boolean condition() {
        double f = Math.random();
        System.out.println(f);
        return f < .99;

    }

    static void commaOperator() {
        for (int i = 0, j = i + 10; i < 10 && j < 15; i++, j++) {
            System.out.println(i + " " + j);

        }
    }


}
