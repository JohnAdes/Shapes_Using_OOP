package com.johnson;

public class Circle implements Shape{
// the filed for the circle
    private final float radius;

    // create the default constructor
    private float getRadius() {
        return radius;
    }

    public Circle(float new_radius) {
       radius = new_radius;
    }

// the area of the circle
    public float getArea(){
        return (float) (3.14 * radius * radius);
    }
    // the perimeter of the circle
    public float getPerimeter() {
        return (float) (6.28 * radius);
    }


    @Override
    public String toString() {
        return "Circle = [radius: " + getRadius() + ", area: " + getArea() + ", perimeter: " + getPerimeter() + "]" ;
    }
}
