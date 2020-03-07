package chapter3;

import java.util.Random;

public class SwitchStatement {
    public static void main(String[] args) {
        Random rand = new Random(47);
        for (int i = 0; i < 10; i++) {
            int c = rand.nextInt(26) + 'a'; // 'a' is automatically converted into 'int'
            System.out.print((char) c + ", " + c + ", ");
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("vowel");
                    break;
                case 'y':
                case 'w':
                    System.out.println("sometimes vowel");
                    break;
                default:
                    System.out.println("constant");
                    break;


            }


        }

    }
}
