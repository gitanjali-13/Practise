package com.bridgelabz.practice;

import java.util.Scanner;
import java.lang.Math;

public class AreaAndPerimeter {
    double r,area,length,width,side1,side2,side3;
    static double perimeter;
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        AreaAndPerimeter a1 = new AreaAndPerimeter();
        System.out.println("--Please select your option--");
        System.out.println("MENU");
        System.out.println("1.Triangle:");
        System.out.println("2.Circle");
        System.out.println("3.Rectangle");
        System.out.println("4.");

        int num = a1.sc.nextInt();
        switch (num)
        {
            case 1 :
                a1.triangle();
                break;

            case 2 :
                a1.circle();
                break;

            case 3 :
                System.out.println("Enter length of the rectangle:");
                a1.length = a1.sc.nextDouble();
                System.out.println("Enter width of the rectangle");
                a1.width = a1.sc.nextDouble();
                a1.area = a1.length * a1.width;
                System.out.println("Area of the rectangle :" +a1.area);
                break;
            case 4 :

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
        perimeter = 2 * Math.PI * r;
        System.out.println("Perimeter of the circle:" +perimeter);
    }
    public  void  triangle(){
        System.out.println("Enter first side of the triangle:");
        side1 = sc.nextFloat();
        System.out.println("Enter second side of the triangle");
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
