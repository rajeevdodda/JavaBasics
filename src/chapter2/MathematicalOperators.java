package chapter2;

import java.util.*;

public class MathematicalOperators {
    public static void main(String[] args) {
        Random rand = new Random(47);


        int i, j, k;
        j = rand.nextInt(100) + 1;
        System.out.println("j value : " + j);

        k = rand.nextInt(100) + 1;
        System.out.println("k value : " + k);
        i = j % k;
        System.out.println("i value : " + i);
        i = j / k;
        System.out.println("i value : " + i);

        // To do perfect division we need to cast denominator to float or double.
        float f = j / (float) (k);
        System.out.println("f value : " + f);
        System.out.println('c'/'z');

        float u, v, w;
        v = rand.nextFloat();
        w = rand.nextFloat();
        System.out.println("v value : " + v + " w value : "+ w);
        System.out.println("v / w  : "+ v / w);
        System.out.println("v % w  : "+ v % w);



    }
}