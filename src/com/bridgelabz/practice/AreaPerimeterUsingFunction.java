package com.bridgelabz.practice;

import java.util.Scanner;

public class AreaPerimeterUsingFunction {
    public static void main(String[] args) {
        AreaPerimeterUsingFunction ap = new AreaPerimeterUsingFunction();
        ap.circle();
        ap.rectangle();
        ap.triangle();

    }
    float length,width,r,side1,side2,side3;
    double pi = 3.14, area,perimeter;
    Scanner sc = new Scanner(System.in);

    public void circle(){
        System.out.println("Enter redius of the circle:");
        r = sc.nextFloat();
        perimeter = 2 * pi * r;
        System.out.println("Perimeter of the circle:" +perimeter);
        area = pi * r * r ;
        System.out.println("Area of the circle:" +area);
    }
    public void rectangle(){
        System.out.println("Enter length of the rectangle:");
        length =  sc.nextFloat();
        System.out.println("Enter width of the rectangle");
        width = sc.nextFloat();
        area = length * width;
        System.out.println("Area of the rectangle :" +area);
        perimeter = 2 * (area * width);
        System.out.println("Perimeter of the rectangle" +perimeter);
    }
    public void triangle(){
        System.out.println("Enter first side of  triangle:");
        side1 = sc.nextFloat();
        System.out.println("Enter second side of  triangle");
        side2 = sc.nextFloat();
        System.out.println("Enter third side of the triangle");
        side3 = sc.nextFloat();
        perimeter = side1 + side2 + side3;
        System.out.println("Perimeter of the triangle" +perimeter);
        System.out.println("Enter length of the triangle:");
        length = sc.nextFloat();
        System.out.println("Enter width of the triangle:");
        width = sc.nextFloat();
        area = (length * width )/2;
        System.out.println("Area of the triangle" +area);
    }
}
