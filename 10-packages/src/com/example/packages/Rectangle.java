package com.example.packages;

// A class can implement multiple interfaces
// Can implement multiple interfaces Shape, Polygon, etc
// If a class implements an interface, it has to implement all the methods of the interface
// If a class is abstract, it does not have to implement all the methods of the interface
// 
// If a concrete class does not implement all the methods of the interface, we get an error
// For eg: Rectangle is not abstract and does not override abstract method getSides() in Polygon
public class Rectangle implements Polygon {
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

    protected boolean isSquare() {
        return length == breadth;
    }
}