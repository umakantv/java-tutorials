package interfaces;


public class Main {
    public static void main(String[] args) {
        Polygon rectangle = new Rectangle(4, 5);
        // System.out.println(rectangle.getArea());
        rectangle.printSides();
        rectangle.printArea();
        Shape.showProperty("Side", rectangle.getSides());

        Shape circle = new Circle(5);
        circle.printArea();
    }
}

// Interfaces are used to achieve abstraction
interface Shape {
    public double getArea(); // abstract keyword is optional

    // default methods can be defined in interfaces
    default public void printArea() {
        // System.out.println("Area: " + getArea());
        print("Area", getArea());
    }

    // static methods can be defined in interfaces
    // static methods can only be used inside the interface
    // static methods cannot be abstract, they have to be defined in the interface
    // they can be called from other static and non-static methods
    // and as always, static methods can't call non-static methods
    // error: non-static method print(String,double) cannot be referenced from a static context
    // We can make print static to fix this error
    static public void showProperty(String property, double value) {
        print(property, value);
    }

    // private methods can be defined in interfaces
    // private methods can only be used inside the interface
    // private methods cannot be abstract, they have to be defined in the interface
    // non-static private methods can be called from other static methods
    static private void print(String property, double value) {
        System.out.println(property + ": " + value);
    }
}

// Interfaces are like contracts, they define what a class should do
// Interfaces are like 100% abstract classes
// Interfaces can only have abstract methods
// Interfaces can extend multiple other interfaces
interface Polygon extends Shape {

    // int sides = 4; // public static final int sides = 4;

    public int getSides();

    // default methods can be defined in interfaces
    default public void printSides() {
        System.out.println("Sides: " + getSides());
    }
}

// A class can implement multiple interfaces
// Can implement multiple interfaces Shape, Polygon, etc
// If a class implements an interface, it has to implement all the methods of the interface
// If a class is abstract, it does not have to implement all the methods of the interface
// 
// If a concrete class does not implement all the methods of the interface, we get an error
// For eg: Rectangle is not abstract and does not override abstract method getSides() in Polygon
class Rectangle implements Polygon {
    double length;
    double breadth;
    int sides;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
        this.sides = 4;
    }

    public int getSides() {
        return sides;
    }

    public double getArea() {
        return length * breadth;
    }
}

class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }
}
