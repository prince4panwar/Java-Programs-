//Write a Java program to create a class called Rectangle with private instance variables length and width. Provide public getter and setter methods to access and modify these variables.
class Rectangle {
    private double length;
    private double width;

    // Getter and Setter for 'length'
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Getter and Setter for 'width'
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}

public class pro28 {
    public static void main(String[] args) {
        // Creating an instance of Rectangle class
        Rectangle rect = new Rectangle();

        // Setting values using setter methods
        rect.setLength(5.0);
        rect.setWidth(3.0);

        // Getting and displaying values using getter methods
        System.out.println("Length: " + rect.getLength());
        System.out.println("Width: " + rect.getWidth());
    }
}
