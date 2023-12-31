
//Program to Convert Enum to String
import java.io.*;

// Enum 

enum Fruits {

    Orange,

    Apple,

    Banana,

    Mango;
}

// Main class

class GFG {

    // Main driver method

    public static void main(String[] args) {

        // Printing all the values

        System.out.println(Fruits.Orange.name());

        System.out.println(Fruits.Apple.name());

        System.out.println(Fruits.Banana.name());

        System.out.println(Fruits.Mango.name());

    }
}