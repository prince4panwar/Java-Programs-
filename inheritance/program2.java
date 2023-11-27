/* Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car that overrides the drive() method to print "Repairing a car". */

// Vehicle class
class Vehicle {
    public void drive() {
        System.out.println("Driving a vehicle...");
    }
}

// Car subclass extending Vehicle
class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Repairing a car"); // Car overrides to repair
    }
}

class Inheritance2 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(); // Creating an instance of Vehicle
        Vehicle car = new Car(); // Creating an instance of Car as Vehicle

        System.out.println("Driving a vehicle:");
        vehicle.drive(); // Calling drive() on the vehicle

        System.out.println("\nRepairing a car:");
        car.drive(); // Calling drive() on the car (which will repair - overridden method)
    }
}
