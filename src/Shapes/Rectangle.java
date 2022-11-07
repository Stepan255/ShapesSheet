package Shapes;

import Exceptions.InvalidFigure;

public class Rectangle extends Shape{

    private double sideA;
    private double sideB;

    public Rectangle(String name, double sideA, double sideB) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculatePerimeter() {
        return (2 * sideA) + (2 * sideB);
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }
}
