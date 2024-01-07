package com.example.interfaces;

import com.example.packages.*;

public class App {
    public static void main(String[] args) {
        Polygon rectangle = new Rectangle(4, 5);
        // System.out.println(rectangle.getArea());
        rectangle.printSides();
        rectangle.printArea();
        Shape.showProperty("Side", rectangle.getSides());

        // Rectangle rect = new Rectangle(4, 4);
        // System.out.println("Is Sqaure" + rect.isSquare()); // error: isSquare() has protected access in Rectangle
        // Any class in interfaces packages that extends Rectangle can access isSquare()


        Shape circle = new Circle(5);
        circle.printArea();
    }
}