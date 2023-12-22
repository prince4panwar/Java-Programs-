//Create a class showing an example of copy constructor.
class Point {
    private int x;
    private int y;

    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copy Constructor
    public Point(Point otherPoint) {
        this.x = otherPoint.x;
        this.y = otherPoint.y;
    }

    // Method to display coordinates
    public void display() {
        System.out.println("X: " + x + ", Y: " + y);
    }
}

public class pro22 {
    public static void main(String[] args) {
        // Creating an instance of Point using the constructor
        Point point1 = new Point(5, 10);

        // Using the copy constructor to create another Point object
        Point point2 = new Point(point1);

        // Displaying coordinates of both points
        System.out.println("Point 1:");
        point1.display();

        System.out.println("Point 2:");
        point2.display();
    }
}
