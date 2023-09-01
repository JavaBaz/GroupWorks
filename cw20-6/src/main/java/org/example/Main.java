package org.example;

// Main application
public class Main {
    public static void main(String[] args) {
        // Create a Square object
        Square square = new Square(5); // Assume a side length of 5

        // Create a RectangleAdapter object, adapting the Square to work with rectangles
        RectangleAdapter rectangleAdapter = new RectangleAdapter(square);

        // Calculate the area of the square using the adapter
        double squareArea = square.calculateArea();
        System.out.println("Area of the square: " + squareArea);

        // Calculate the area of a rectangle using the same adapter
        double rectangleArea = rectangleAdapter.calculateArea();
        System.out.println("Area of the rectangle: " + rectangleArea);
    }
}