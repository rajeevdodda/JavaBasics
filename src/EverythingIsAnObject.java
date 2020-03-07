import java.math.BigDecimal;
import java.math.BigInteger;
// java.lag is by default imported

public class EverythingIsAnObject {
    public static void main(String[] args) {

        // Creating reference.
        String s;

        // Initialising reference.
        s = "Java";


        // In the below syntax variable holds value directly and is placed on stack.
        // By default primitive types are placed on stack.
        int i = 0;

        // Both creation and Initialisation.
        // Wrapper classes are used to make non-primitive object of primitive type on heap.
        String ss = new String(s);
        // or
        String sss = new String("JAVA");


        // Auto Boxing => converts primitive to wrapper type and vice versa.
        Character ch = new Character('R');
        char c = ch;
        Character ch1 = c;

        // BigInteger bigInteger = 12; behaves like int
        // BigDecimal bigDecimal = 12.1; behaves like float
        // Operations are slower on the above wrapper classes
        System.out.println("Big Integer, Big Decimal doesnt have primitive analogue");


        System.out.println(s + " " + ss);

        // Array's are initialised automatically and cannot be accessed out of its range.
        // We are creating array of references to the objects.
        int[] intArray = new int[10];
        Integer[] wrapperIntegerArray = new Integer[10];
        System.out.println(intArray[5]); // returns 0
        System.out.println(wrapperIntegerArray[5]); // returns null

        // Index verification is done during runtime.
        try {
            System.out.println(intArray[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        DataOnly dataOnly = new DataOnly();
        // By default they are primitive members are initialized to default values and objects are initialized to null
        // This doesn't apply to local variables in methods.
        System.out.println(dataOnly.bool + " " + dataOnly.c + " " + dataOnly.b + " " + dataOnly.s + " " +
                dataOnly.i + " " + dataOnly.l + " " + dataOnly.f + " " + dataOnly.d + " " + dataOnly.integer);
        System.out.println("Static int "+DataOnly.anInt);

        // assigning values to fields
        dataOnly.integer = 123;
        dataOnly.i = 12;
        dataOnly.bool = true;
        System.out.println(dataOnly.b + " " + dataOnly.i + " " + dataOnly.integer);

        DataOnly.go();
        System.out.println(dataOnly.storage("rajeev"));
        ShowProperties.getSystemProperties();


    }
}

class DataOnly {
    // fields or data members
    // They can be primitive types or object of any type you can talk to via its reference.
    int i; // 0
    char c; // " "
    byte b; // 0
    short s; // 0
    boolean bool; // true
    long l;  // 0
    float f; // 0.0
    double d; // 0.0
    Integer integer; // null

    //class data
    static int anInt;

    // member functions
    // static method can be also be called using class name along with object.
    // void returns nothing. return in void used to exit the method.
    // class method
    static void go() {
        // Accessing "i" without initialization will give "Compile time error"
        // Non-static content cannot be access from static methods. since they must be tied to an object.
        System.out.println("Called go method" + " ");
    }

    int storage(String s){
        return s.length() * 2;
    }

}

class ShowProperties{
    static void getSystemProperties(){
        System.out.println("*****************************************************************************************");
        System.getProperties().list(System.out);
        System.out.println("*****************************************************************************************");
        System.out.println(System.getProperty("user.name"));
        System.out.println("*****************************************************************************************");
        System.out.println(System.getProperty("java.library.path"));
    }
}