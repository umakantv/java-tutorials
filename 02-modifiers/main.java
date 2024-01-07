package modifiers;

public class Modifiers {
    
    int x = 5;


    public static void main(String[] args) {

        AccessModifers myObj = new AccessModifers();
        System.out.println(myObj.x); // public variable
        System.out.println(myObj.y); // protected variable
        // System.out.println(myObj.z); // private variable - access denied

        myObj.myPublicMethod(); // public method
        myObj.myProtectedMethod(); // protected method
        // myObj.myPrivateMethod(); // private method - access denied

        System.out.println(NonAccessModifiers.x); // final variable
        NonAccessModifiers.myStaticMethod(); // static method

    }
}

// class has to be static as it is being used in a static method
class AccessModifers {
    // Access Modifiers
    // public - accessible everywhere
    // private - accessible only in the same class
    // protected - accessible in the same class, package and subclasses
    // default modifier - 
    public Integer x = 5;

    protected Integer y = 10;

    private Integer z = 15;

    // public static void main(String[] args) {
    // }

    public void myPublicMethod() {
        System.out.println("Public method");
        myPrivateMethod();
    }

    protected void myProtectedMethod() {
        System.out.println("Protected method can access private variable");
        System.out.println(z);
    }

    private void myPrivateMethod() {
        System.out.println("Private method called from public method");
    }
}

class NonAccessModifiers {

    static final int x = 5; // final variable - cannot be changed

    private static String message = "Any private static data is accessed from static function"; // final variable - cannot be changed

    int y = 10;

    public static void myStaticMethod() {
        System.out.println("Static method");
        System.out.println(message);

        // System.out.println(y); // cannot access non-static variable from static method
        // non-static variable y cannot be referenced from a static context
    }
}