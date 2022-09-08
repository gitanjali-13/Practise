package com.bridgelabz.practice;

import java.util.Scanner;

public class Triangle {
    public static void main(String args[]){
        Float length,width ,perimeter,area,num1,num2,num3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number of the triangle:");
        num1 = sc.nextFloat();
        System.out.println("Enter second number of the triangle");
        num2 = sc.nextFloat();
        System.out.println("Enter third of the triangle");
        num3 = sc.nextFloat();
        perimeter = num1 + num2 + num3;
        System.out.println("Perimeter of the triangle" +perimeter);
        System.out.println("Enter length of the triangle:");
        length = sc.nextFloat();
        System.out.println("Enter width of the triangle:");
        width = sc.nextFloat();
        area = (length * width )/2;
        System.out.println("Area of the triangle" +area);
    }
}
