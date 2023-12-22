//Create a class showing an example of parameterized constructor.
class MyClass {
    private int number;
    private String name;

    // Default Constructor
    public MyClass() {
        number = 0;
        name = "Default";
    }

    // Method to display values
    public void display() {
        System.out.println("Number: " + number);
        System.out.println("Name: " + name);
    }
}

public class pro21 {
    public static void main(String[] args) {
        // Creating an instance of MyClass using the default constructor
        MyClass myObject = new MyClass();

        // Displaying values initialized by the default constructor
        myObject.display();
    }
}
