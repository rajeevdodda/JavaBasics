package chapter3;

public class LabeledForLoop {
    public static void main(String[] args){
        labeledForLoop();
    }
    static void labeledForLoop() {
        int i = 0;
        outer:
        for (; true; ) {
            inner:
            for (; i < 10; i++) {
                System.out.println("i : " + i);
                if (i == 2) {
                    System.out.println("continue");
                    continue;
                }

                if (i == 3) {
                    System.out.println("break");
                    i++; // otherwise 'i' never gets incremented
                    break;
                }

                if (i == 7) {
                    System.out.println("continue outer");
                    i++; // otherwise 'i' never gets incremented
                    continue outer;
                }

                if (i == 8) {
                    System.out.println("break outer");
                    i++; // otherwise 'i' never gets incremented
                    break outer;
                }
                for (int k = 0; k <5; k ++){
                    if (k ==3){
                        System.out.println("continue inner");
                        continue  inner;
                    }


                }


            }

        }

    }
}
