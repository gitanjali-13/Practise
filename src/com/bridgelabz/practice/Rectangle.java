package com.bridgelabz.practice;

import java.util.Scanner;

public class Rectangle {
    public static void main(String args[]){
        Float length,width,perimeter,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the rectangle:");
        length = sc.nextFloat();
        System.out.println("Enter width of the rectangle");
        width = sc.nextFloat();
        area = length * width;
        System.out.println("Area of the rectangle :" +area);
        perimeter = 2 * (area * width);
        System.out.println("Perimeter of the rectangle" +perimeter);
        sc.close();
    }
}


