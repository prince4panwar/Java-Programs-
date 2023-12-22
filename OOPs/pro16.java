//Write a Java program to create a class called "Shape" with abstract methods for calculating area and perimeter, and subclasses for "Rectangle", "Circle", and "Triangle".
abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing abstract methods
    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Circle extends Shape {
    private double radius;
    private final double PI = 3.14159;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing abstract methods
    @Override
    double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * PI * radius;
    }
}

class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    // Constructor
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    // Implementing abstract methods
    @Override
    double calculateArea() {
        // Heron's formula for area of a triangle
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}

public class pro16 {
    public static void main(String[] args) {
        // Creating instances of shapes
        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(7);
        Triangle triangle = new Triangle(3, 4, 5);

        // Calculating area and perimeter
        System.out.println("Rectangle - Area: " + rectangle.calculateArea() + ", Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Circle - Area: " + circle.calculateArea() + ", Circumference: " + circle.calculatePerimeter());
        System.out.println("Triangle - Area: " + triangle.calculateArea() + ", Perimeter: " + triangle.calculatePerimeter());
    }
}
