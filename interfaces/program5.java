// Write a Java program to create an interface Resizable with methods resizeWidth(int width) and resizeHeight(int height) that allow an object to be resized. Create a class Rectangle that implements the Resizable interface and implements the resize methods.
interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangle implements Resizable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void resizeWidth(int width) {
        this.width = width;
    }

    public void resizeHeight(int height) {
        this.height = height;
    }

    public String toString() {
        return "Rectangle[width=" + width + ", height=" + height + "]";
    }
}
class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println(rectangle); // Output: Rectangle[width=5, height=10]

        rectangle.resizeWidth(20);
        rectangle.resizeHeight(30);
        System.out.println(rectangle); // Output: Rectangle[width=20, height=30]
    }
}