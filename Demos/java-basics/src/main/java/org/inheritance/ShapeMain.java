package org.inheritance;

// private attributes or methods are not inherited
// abstract classes cannot be instantiated
// abstract classes can have non abstract methods
// while inheriting all abstract methods need to be overridden by the child class
abstract class Shape {
    private String colour;

    public Shape() {
    }

    public Shape(String colour) {
        this.colour = colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public abstract void draw();

    // abstract methods allows us to define a method without having to provide
    // an implementation to them.
    // abstract methods can only be declared inside an abstract class
    protected abstract void area();
}

class Square extends Shape {

    private int side;

    public Square() {
    }

    public Square(String colour, int side) {
        super(colour);
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void area() {
        System.out.println("Calculating area of square...");
        System.out.println("Area of Square: " + (this.side * this.side));
    }

    @Override
    public void draw() {
        System.out.println("Drawing shape of a circle with " + super.getColour());
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}

class Circle extends Shape {

    private int radius;

    public Circle() {
    }

    public Circle(String colour, int radius) {
        super(colour);
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    // Method overriding is a way by which a subclass can provide a different implementation
    // to a method supplied by the base class. To override a method, all we have to do is redefine
    // the method in the child class, optionally we can use the @Override annotation.
    // Overridden method cannot be less accessible
    @Override
    protected void area() {
        // super.area();
        System.out.println("Calculating area of circle..");
        System.out.println("Area of Circle: " + (3.14 * (this.radius * this.radius)));
    }

    @Override
    public void draw() {
        System.out.println("Drawing shape of a square with " + super.getColour());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

public class ShapeMain {
    public static void main(String[] args) {

        // Shape s = new Shape(); // error Shape is abstract

        Circle circle = new Circle();
        circle.setRadius(5);
        circle.setColour("red");
        circle.area(); // Will the area of the circle be displayed?
        circle.draw();
        System.out.println(circle);

        System.out.println();

        Square square = new Square();
        square.setSide(5);
        square.setColour("green");
        square.area();
        square.draw();
        System.out.println(square);

    }
}
