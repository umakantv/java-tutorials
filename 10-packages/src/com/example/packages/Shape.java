package com.example.packages;

// Interfaces are used to achieve abstraction
public interface Shape {
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