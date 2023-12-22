//Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle.
class Rectangle {
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate area
    public double calculateArea() {
        return width * height;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    // Getter methods (optional)
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}

public class pro3 {
    public static void main(String[] args) {
        // Creating a rectangle instance
        Rectangle rectangle = new Rectangle(5.0, 10.0);

        // Calculating area and perimeter
        double area = rectangle.calculateArea();
        double perimeter = rectangle.calculatePerimeter();

        // Printing the calculated values
        System.out.println("Rectangle Area: " + area);
        System.out.println("Rectangle Perimeter: " + perimeter);
    }
}
