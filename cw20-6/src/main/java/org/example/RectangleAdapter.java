package org.example;

// Step 2: Implement the RectangleAdapter class
public class RectangleAdapter implements Shape {
    private Square square;

    public RectangleAdapter(Square square) {
        this.square = square;
    }

    @Override
    public double calculateArea() {
        // Calculate the area of a rectangle by using the square's side length as both the length and width
        double sideLength = square.getSideLength();
        return sideLength * sideLength;
    }
}
