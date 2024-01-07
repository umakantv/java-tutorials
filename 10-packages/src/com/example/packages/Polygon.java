package com.example.packages;

// Interfaces are like contracts, they define what a class should do
// Interfaces are like 100% abstract classes
// Interfaces can only have abstract methods
// Interfaces can extend multiple other interfaces
public interface Polygon extends Shape {

    // int sides = 4; // public static final int sides = 4;

    int getSides();

    // default methods can be defined in interfaces
    default public void printSides() {
        System.out.println("Sides: " + getSides());
    }
}