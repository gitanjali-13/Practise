package com.bridgelabz.practice;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        float r;
        double pi = 3.14,perimeter,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter redius of the circle:");
        r = sc.nextFloat();
        perimeter = 2 * pi * r;
        System.out.println("Perimeter of the circle:" +perimeter);
        area = pi * r * r ;
        System.out.println("Area of the circle:" +area);

    }
}
