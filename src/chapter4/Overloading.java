package chapter4;

public class Overloading {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Tree tree1 = new Tree(10);
        tree.info();
        tree1.info("Banyan");
        tree.ordering(10, "rajeev");
        tree.ordering("rajeev", 10);

    }
}


class Tree{
    int height;
    Tree(){
        System.out.println("Planting a seedling.");
        height = 0;
    }

    Tree(int initialHeight){
        height = initialHeight;
        System.out.println("Creating a  new Tree that is "+ height + " feet tall.");
    }

    void info(){
        System.out.println("Tree is "+ height + " feet tall.");
    }

    void info(String s){
        System.out.println(s + " Tree is "+ height + " feet tall.");
    }

    // ordering also makes methods distinct
    void ordering(String s, int i){
        System.out.println(" String 1st "+ s + " Int 2nd : "+ i);
    }
    void ordering(int i, String s ){
        System.out.println(" Int 1st "+ i + " String 2nd : "+ s);
    }
}