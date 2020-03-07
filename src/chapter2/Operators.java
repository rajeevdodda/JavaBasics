package chapter2;// All operators works with primitives.
// Exceptions are '=', '==', '!=' which works with objects.
// 'String' class supports '+' , '+='

public class Operators {
    public static void main(String[] args) {

        int a = 1;
        int b;
        // primitives hold actual value not the reference, so change in 'a' doesnt affect 'b'
        b = a;
        a += 1;
        System.out.println("a :" + a + " b :" + b);

        Integer integerA = 1;
        Integer integerB = integerA;
        integerA += 1;
        System.out.println("integerA :" + integerA + " integerB :" + integerB);

        String s = "a";
        String s1 = s;
        s = s + "b";
        System.out.println("s :" + s + " s1 :" + s1);


        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 10;
        System.out.println("t1 level :" + t1.level + " t2 level :" + t2.level);

        // In object assignment, whenever we manipulate one object it changes another object also, bcz we are copying
        // reference not the actual content.
        // aliasing concept
        t1 = t2;
        System.out.println("t1 level :" + t1.level + " t2 level :" + t2.level);
        t1.level = 29;
        System.out.println("t1 level :" + t1.level + " t2 level :" + t2.level);


        // Aliasing during method calls

        Letter x = new Letter();
        x.c = 'a';
        System.out.println("1 x.c : " + x.c);
        passObject(x);
        System.out.println("1 x.c : " + x.c);



    }

    static void passObject(Letter y){
        y.c = 'z';

    }
}


class Tank {
    int level;
}


class Letter {
    char c;
}