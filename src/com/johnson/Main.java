package com.johnson;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
//create a scanner object to take input from the user
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Enter the length and width of the rectangle separated by space");
            float length = in.nextFloat();
            float width = in.nextFloat();
            System.out.println("Enter the radius of the circle");
            float radius = in.nextFloat();
            System.out.println("Enter the side of the square");
            float side = in.nextFloat();

            //      Print output
            System.out.println("====================================");
            System.out.println(" ");
            System.out.println("Finding Area and Perimeter of Shapes");
            System.out.println(" ");
            System.out.println("====================================");
            System.out.println(" ");


//      instantiate an object of the rectangle class
            Rectangle rec = new Rectangle(length, width);
            System.out.println("Finding area of rectangle with length =" + rec.getLength() + " and width =" + rec.getWidth());
            System.out.println("Finding perimeter of rectangle with length =" + rec.getLength() + " and width =" + rec.getWidth());
            System.out.println("Area = " + rec.getArea() + " and Perimeter = " + rec.getPerimeter());

            System.out.println(" ");


//      instantiate an object of the circle class
            Circle circle = new Circle(radius);
            System.out.println("Finding the area of circle with radius =" + radius);
            System.out.println("Finding the perimeter of circle with radius =" + radius);
            System.out.println("Area = " + circle.getArea() + " and Perimeter = " + circle.getPerimeter());

            System.out.println(" ");


//      instantiate an object of the square class
            Square sqr = new Square(side);
            System.out.println("Area = " + sqr.getArea() + " and Perimeter = " + sqr.getPerimeter());
            System.out.println(" ");

            System.out.println("==========================");
            System.out.println(" ");
            System.out.println("Printing shapes as strings");
            System.out.println(" ");
            System.out.println("==========================");
            System.out.println(" ");

            System.out.println(rec.toString());
            System.out.println(circle.toString());
            System.out.println(sqr.toString());


        }

        catch (Throwable e){
            System.out.println("Input not correct! Try again");
            System.out.println("Try again with the right input");
                main(args);
        }



    }
}
