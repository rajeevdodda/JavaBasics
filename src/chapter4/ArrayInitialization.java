package chapter4;

import java.util.Arrays;

public class ArrayInitialization {
    public static void main(String[] args) {
        int a1[] = {1, 2, 3, 4};
        int a2[] = a1;
        Integer integer[] = {new Integer(1), new Integer(3)};
        for (int i = 0; i < a2.length; i++) {
            a2[i] = a2[i] + 1;
        }
        for (int i = 0; i < a1.length; i++) {
           System.out.println("a1["+i+"] = "+ a1[i]);
        }
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(integer));
        Integer integer1[] = new Integer[10];
        System.out.println(Arrays.toString(integer1));
        int[] a3 = new int[10];
        System.out.println(Arrays.toString(a3));

    }
}
