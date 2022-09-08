package com.bridgelabz.practice;

import java.util.Scanner;
import java.lang.Math;

public class AreaAndPerimeter {
    double r,area ,length,width;
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        AreaAndPerimeter a1 = new AreaAndPerimeter();
        System.out.println("--Please select your option--");
        System.out.println("MENU");
        System.out.println("1.Area of triangle:");
        System.out.println("2.Perimeter of triangle:");
        System.out.println("3.Area of circle:");
        System.out.println("4.Perimeter of circle:");
        System.out.println("5.Area of rectangle:");
        System.out.println("6.Perimeter of rectangle:");

        int num = a1.sc.nextInt();
        switch (num)
        {
            case 1 :
                //Scanner sc = new Scanner(System.in);
                System.out.println("Enter length of the triangle:");
                a1.length = a1.sc.nextDouble();
                System.out.println("Enter width of the triangle:");
                a1.width = a1.sc.nextDouble();
                a1.area = (a1.length * a1.width )/2;
                System.out.println("Area of the triangle" +a1.area);
                break;
            case 2 :
                double side1,side2,side3,perimeter;
                System.out.println("Enter first side of  triangle:");
                side1 = a1.sc.nextDouble();
                System.out.println("Enter second side of  triangle");
                side2 = a1.sc.nextDouble();
                System.out.println("Enter third side of triangle");
                side3 = a1.sc.nextDouble();
                perimeter = side1 + side2 + side3;
                System.out.println("Area of the triangle" +perimeter);
                break;
            case 3 :
                a1.circle();
                break;
            case 4 :
                //double pi = 3.14;
                System.out.println("Enter redius of the circle:");
                a1.r = a1.sc.nextDouble();
                perimeter = 2 * Math.PI * a1.r;
                System.out.println("Perimeter of the circle:" +perimeter);
                break;
            case 5 :
                System.out.println("Enter length of the rectangle:");
                a1.length = a1.sc.nextDouble();
                System.out.println("Enter width of the rectangle");
                a1.width = a1.sc.nextDouble();
                a1.area = a1.length * a1.width;
                System.out.println("Area of the rectangle :" +a1.area);
                break;
            case 6 :

                System.out.println("Enter length of the rectangle:");
                a1.length = a1.sc.nextDouble();
                System.out.println("Enter width of the rectangle");
                a1.width = a1.sc.nextDouble();
                perimeter = 2 * (a1.length * a1.width);
                System.out.println("Perimeter of the rectangle" +perimeter);
                break;

        }
    }
    public void circle(){
        System.out.println("Enter redius of the circle:");
        r = sc.nextDouble();
        area = Math.PI * r * r ;
        System.out.println("Area of the circle:" +area);

    }


}
