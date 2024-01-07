package com.example.packages;

public class App {
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