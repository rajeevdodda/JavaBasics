package chapter4;

class Banana {

    void peel(int k) {
        System.out.println("Peel the banana : " + k + " times.");
    }
}


class Leaf {
    int i = 0;

    // this method return reference to the same current object via "this" keyword,
    // multiple operations can be easily performed on the same object.

    Leaf increment() {
        i++;
        return this;
    }

    void decrement() {
        i--;
    }

    void print() {
        System.out.println("i = " + i);
    }
}

class Apple{
    Apple getPeeled(){
        System.out.println("get peeled method called in Apple.");
        return Peeler.peel(this);
    }
}
class Peeler{
    static Apple peel(Apple apple){
        System.out.println("peeling in process.");
        return apple;
    }

}
class Person{
    public void eat(Apple apple){
        Apple peeled = apple.getPeeled();
        System.out.println("Apple peeled.");
    }

}

public class ThisKeyword {
    public static void main(String[] args) {
        Banana a = new Banana(), b = new Banana();
        int i = 10, j = 11;
        a.peel(i);
        b.peel(j);


        // Background work: a secret first argument(reference to the object) is passed to the peel() method.
        //Banana.peel(a, i)
        // "this" keyword which can be used inside a non-static method - produces ref to the object that the method
        // has been called for.

        // Ypu dont require "this" when your are calling a method of your class from another method of your class.
        Leaf leaf = new Leaf();
        leaf.increment().increment().decrement();
        System.out.println(leaf.i);
        new Person().eat(new Apple());
    }


}