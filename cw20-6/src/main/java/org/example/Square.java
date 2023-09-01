package org.example;

// Existing Square class
public class Square {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public double calculateArea() {
        return sideLength * sideLength;
    }
}
