package com.johnson;

public class Square extends Rectangle {

    private final float sqrPerimeter = (4 * getLength());
    private final float sqrArea = getLength() * getWidth();

    public Square(float side) {
        super(side, side);

    }

    // the area of the square
    public float getArea() {
    System.out.println("Finding area of square with side =" + getLength() );
        return sqrArea;
    }

    // the perimeter of the square
    public float getPerimeter() {
        System.out.println("Finding perimeter of the square with side =" + getLength());
        return sqrPerimeter;
    }


    @Override
    public String toString() {
        return "Square = [side: " + getLength() + ", area: " + sqrArea + ", perimeter: " + sqrPerimeter + "]";
    }
}
