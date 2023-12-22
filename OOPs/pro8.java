//Write a Java program to create class called "TrafficLight" with attributes for color and duration, and methods to change the color and check for red or green.
class TrafficLight {
    private String color;
    private int duration; // Duration in seconds

    // Constructor
    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    // Method to change the color of the traffic light
    public void changeColor(String newColor, int newDuration) {
        this.color = newColor;
        this.duration = newDuration;
        System.out.println("Traffic light changed to " + newColor + " for " + newDuration + " seconds.");
    }

    // Method to check if the light is red
    public boolean isRed() {
        return color.equalsIgnoreCase("red");
    }

    // Method to check if the light is green
    public boolean isGreen() {
        return color.equalsIgnoreCase("green");
    }

    // Getter methods
    public String getColor() {
        return color;
    }

    public int getDuration() {
        return duration;
    }
}

public class pro8 {
    public static void main(String[] args) {
        // Creating a TrafficLight instance
        TrafficLight trafficLight = new TrafficLight("red", 30);

        // Checking initial light color and duration
        System.out.println("Initial Traffic Light Color: " + trafficLight.getColor());
        System.out.println("Initial Duration: " + trafficLight.getDuration() + " seconds");

        // Changing the color and duration of the traffic light
        trafficLight.changeColor("green", 45);

        // Checking if the light is red or green
        if (trafficLight.isRed()) {
            System.out.println("Traffic light is currently red.");
        } else if (trafficLight.isGreen()) {
            System.out.println("Traffic light is currently green.");
        } else {
            System.out.println("Traffic light is neither red nor green.");
        }
    }
}
