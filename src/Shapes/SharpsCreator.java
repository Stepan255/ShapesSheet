package Shapes;

import Exceptions.InvalidFigure;

public class SharpsCreator {
    public SharpsCreator() {
    }

    public Triangle createTriangle(String name, double sideA, double sideB, double sideC){
        if (sideA + sideB > sideC && sideC + sideB > sideA && sideA + sideC > sideB){
            return new Triangle(name, sideA, sideB, sideC);
        }
        throw new InvalidFigure("invalid triangle");
    }

    public Circle createCircle(String name, double radius){
        if (radius > 0){
            return new Circle(name, radius);
        }
        throw new InvalidFigure("invalid radius");
    }

    public Rectangle createRectangle(String name, double sideA, double sideB){
        if (sideA > 0 && sideB > 0){
            return new Rectangle(name, sideA, sideB);
        }
        throw new InvalidFigure("invalid rectangle");
    }

    public Square createSquare(String name, double sideA){
        if (sideA > 0){
            return new Square(name, sideA);
        }
        throw new InvalidFigure("invalid rectangle");
    }

}
