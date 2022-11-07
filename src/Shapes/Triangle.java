package Shapes;

import Exceptions.InvalidFigure;

public class Triangle extends Shape{

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String name, double sideA, double sideB, double sideC) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double calculateArea() {
        double p = (0.5) * calculatePerimeter();
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }
}
