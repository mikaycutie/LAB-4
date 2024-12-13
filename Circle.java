/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mandomichaelajane_lab4;

/**
 *
 * @author Abram
 */
class Circle {

    private double radius;

    // Default constructor with default radius
    public Circle() {
        this.radius = 8.5; // Example default radius
    }

    // Constructor with user-defined radius
    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public double diameter() {
        return 2 * radius;
    }

    public double arearadii(double radi) {
        return Math.PI * Math.pow(radi, 2);
    }

    public double circumradii(double radi) {
        return 2 * Math.PI * radi;
    }

    public double diameterradii(double radi) {
        return 2 * radi;
    }
}


