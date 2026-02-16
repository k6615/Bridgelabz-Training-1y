package com.gla.method;

public interface Circle {
    public void area(int radius){
        System.out.println("Area of circle");
        double area = Math.PI*radius*radius;
    }
    public void circumference(int radius){
        System.out.println("cercumference of circle");
        double perimeter = 2*Math.PI*radius;

    }
}
