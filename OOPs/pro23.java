//Create a class entering the rollno, name and class of the student from user but rollno should be automatically generated as we enter the information of 10 students
class AreaCalculator {
    // Method to calculate the area of a circle
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a rectangle
    public double calculateArea(double length, double width) {
        return length * width;
    }
}

public class pro23 {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        // Calculate area of a circle
        double circleArea = calculator.calculateArea(5.0); // Radius = 5.0
        System.out.println("Area of the circle: " + circleArea);

        // Calculate area of a rectangle
        double rectangleArea = calculator.calculateArea(4.0, 6.0); // Length = 4.0, Width = 6.0
        System.out.println("Area of the rectangle: " + rectangleArea);
    }
}
