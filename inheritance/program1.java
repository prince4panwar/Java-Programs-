/*Write a java program to create a class Animal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method to bark */

// Animal class
class Animal {
    public void makeSound() {
        System.out.println("this is from animal class...");
    }
}

// Cat subclass extending Animal
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("cat does not barking"); // Cat overrides to bark
    }
}

class Inheritance1 {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal(); // Creating an instance of Animal
        Animal myCat = new Cat(); // Creating an instance of Cat as Animal

        System.out.println("Sound of animal:");
        genericAnimal.makeSound(); // Calling makeSound() on the generic animal

        System.out.println("\nSound of the cat:");
        myCat.makeSound(); // Calling makeSound() on the cat (which will bark - overridden method)
    }
}

