// Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute. Calculate the area and circumference of the circle.
class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter method for radius
    public double getRadius() {
        return radius;
    }

    // Setter method for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class pro4 {
    public static void main(String[] args) {
        // Creating a circle instance
        Circle circle = new Circle(5.0);

        // Calculating area and circumference
        double area = circle.calculateArea();
        double circumference = circle.calculateCircumference();

        // Printing the calculated values
        System.out.println("Circle Area: " + area);
        System.out.println("Circle Circumference: " + circumference);

        // Modifying the radius
        circle.setRadius(7.0);

        // Recalculating area and circumference
        area = circle.calculateArea();
        circumference = circle.calculateCircumference();

        // Printing the updated values
        System.out.println("\nUpdated Circle Area: " + area);
        System.out.println("Updated Circle Circumference: " + circumference);
    }
}
