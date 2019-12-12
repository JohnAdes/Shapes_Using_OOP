package com.johnson;

public class Rectangle implements Shape{

    private float length;
    private float width;

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    Rectangle() {
    }

    // the custom constructor of the class
    public Rectangle(float new_length, float new_width) {
         length = new_length;
         width = new_width;
    }

    // the area of the rectangle
    public float getArea(){
        return getLength() * getWidth();
    }

    // the perimeter of the rectangle
    public float getPerimeter() {
        return 2 * (getLength() + getWidth());

    }


    @Override
    public String toString() {
        return "Rectangle = [length: " +length + ", width: " + width + ", area: " + getArea() + " , perimeter: " + getPerimeter() +"]";
    }
}
