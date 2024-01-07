package calculator;

public class Calculator {
    int a, b;

    // Constructor does not have a return type
    // Constructor name is same as class name
    // Constructor is called when an object is created
    // Default constructor is used when no constructor is defined
    public Calculator() {}

    public Calculator(int val1) {
        // Constructor can call another constructor
        this(val1, 0); // this() is used to call another constructor
    }
    
    // Parameterized constructor is called when an object is created with parameters
    // If a parameterized constructor is defined, default constructor also has to be defined
    public Calculator(int a, int b) {
        this.a = a; // this is used to refer to the current object
        this.b = b;
    }

    int add() {
        return a + b;
    }

    public static void main(String[] args) {
        // Calculator calc = new Calculator(4, 5);
        // System.out.println(calc.add());

        Calculator calc2 = new Calculator();
        System.out.println(calc2.add());
    }
}