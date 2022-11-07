import Shapes.Shape;
import Shapes.SharpsCreator;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Canvas canvas = new Canvas(new ArrayList<Shape>());
        SharpsCreator sharpsCreator = new SharpsCreator();
        canvas.addShape(sharpsCreator.createSquare("Square_1", 5));
        canvas.addShape(sharpsCreator.createRectangle("Rectangle_1", 10, 5));
        canvas.addShape(sharpsCreator.createTriangle("Triangle_1", 10, 3, 12));
        canvas.addShape(sharpsCreator.createCircle("Circle_1", 10));
        System.out.println("P = " + canvas.calculatePerimeter());
        System.out.println("S = " + canvas.calculateArea());

    }
}
