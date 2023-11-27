//Write a Java program to create an abstract class Vehicle with abstract methods startEngine() and stopEngine(). Create subclasses Car and Motorcycle that extend the Vehicle class and implement the respective methods to start and stop the engines for each vehicle type.
abstract class Vehicle {
    public abstract void startEngine();
    public abstract void stopEngine();
}

class Car extends Vehicle {
    public void startEngine() {
        System.out.println("Car engine started.");
    }

    public void stopEngine() {
        System.out.println("Car engine stopped.");
    }
}

class Motorcycle extends Vehicle {
    public void startEngine() {
        System.out.println("Motorcycle engine started.");
    }

    public void stopEngine() {
        System.out.println("Motorcycle engine stopped.");
    }
}

 class Main21 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        car.startEngine();
        car.stopEngine();

        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}
