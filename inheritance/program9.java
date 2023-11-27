//
class Vehicle {
    private String make;
    private String model;
    private int year;
    private String fuelType;

    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public double calculateFuelEfficiency() {
        return 0.0;  // Default implementation, to be overridden in subclasses
    }

    public double calculateDistanceTraveled(double fuelAmount) {
        return 0.0;  // Default implementation, to be overridden in subclasses
    }

    public int getMaxSpeed() {
        return 0;  // Default implementation, to be overridden in subclasses
    }
}

class Truck extends Vehicle {
    private int cargoCapacity;

    public Truck(String make, String model, int year, String fuelType, int cargoCapacity) {
        super(make, model, year, fuelType);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public double calculateFuelEfficiency() {
        // Implement the calculation for fuel efficiency specific to trucks
        return 10.0;  // Example value in miles per gallon (MPG)
    }

    @Override
    public double calculateDistanceTraveled(double fuelAmount) {
        // Implement the calculation for distance traveled specific to trucks
        return fuelAmount * calculateFuelEfficiency();
    }

    @Override
    public int getMaxSpeed() {
        return 70;  // Example maximum speed for a truck in mph
    }
}

class Car extends Vehicle {
    private int passengerCapacity;

    public Car(String make, String model, int year, String fuelType, int passengerCapacity) {
        super(make, model, year, fuelType);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public double calculateFuelEfficiency() {
        // Implement the calculation for fuel efficiency specific to cars
        return 25.0;  // Example value in miles per gallon (MPG)
    }

    @Override
    public double calculateDistanceTraveled(double fuelAmount) {
        // Implement the calculation for distance traveled specific to cars
        return fuelAmount * calculateFuelEfficiency();
    }

    @Override
    public int getMaxSpeed() {
        return 120;  // Example maximum speed for a car in mph
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double calculateFuelEfficiency() {
        // Implement the calculation for fuel efficiency specific to motorcycles
        return 50.0;  // Example value in miles per gallon (MPG)
    }

    @Override
    public double calculateDistanceTraveled(double fuelAmount) {
        // Implement the calculation for distance traveled specific to motorcycles
        return fuelAmount * calculateFuelEfficiency();
    }

    @Override
    public int getMaxSpeed() {
        return 150;  // Example maximum speed for a motorcycle in mph
    }
}

class VehicleHierarchyExample {
    public static void main(String[] args) {
        // Example usage of the vehicle classes
        Truck myTruck = new Truck("Ford", "F-150", 2022, "Gasoline", 2000);
        Car myCar = new Car("Toyota", "Camry", 2022, "Gasoline", 5);
        Motorcycle myMotorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2022, "Gasoline");

        double fuelAmount = 20.0;  // Example fuel amount in gallons

        System.out.println("Truck:");
        System.out.println("Fuel Efficiency: " + myTruck.calculateFuelEfficiency() + " MPG");
        System.out.println("Distance Traveled: " + myTruck.calculateDistanceTraveled(fuelAmount) + " miles");
        System.out.println("Max Speed: " + myTruck.getMaxSpeed() + " mph");

        System.out.println("\nCar:");
        System.out.println("Fuel Efficiency: " + myCar.calculateFuelEfficiency() + " MPG");
        System.out.println("Distance Traveled: " + myCar.calculateDistanceTraveled(fuelAmount) + " miles");
        System.out.println("Max Speed: " + myCar.getMaxSpeed() + " mph");

        System.out.println("\nMotorcycle:");
        System.out.println("Fuel Efficiency: " + myMotorcycle.calculateFuelEfficiency() + " MPG");
        System.out.println("Distance Traveled: " + myMotorcycle.calculateDistanceTraveled(fuelAmount) + " miles");
        System.out.println("Max Speed: " + myMotorcycle.getMaxSpeed() + " mph");
    }
}
