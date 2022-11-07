package Shapes;

public abstract class Shape {
    String name;

    protected Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double calculatePerimeter();

    public abstract double calculateArea();
}
