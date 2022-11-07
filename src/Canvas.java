import Shapes.Shape;

import java.util.List;

public class Canvas {

    private List<Shape> canvas;

    public Canvas(List<Shape> canvas) {
        this.canvas = canvas;
    }

    public void addShape(Shape shape){
        canvas.add(shape);
    }

    public double calculatePerimeter() {
        double perimeter = 0;
        for (Shape shape:
             canvas) {
            perimeter += shape.calculatePerimeter();
        }
        return perimeter;
    }

    public double calculateArea() {
        double area = 0;
        for (Shape shape:
                canvas) {
            area += shape.calculateArea();
        }
        return area;
    }
}
