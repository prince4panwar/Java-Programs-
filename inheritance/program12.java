//Create a program, showing an example of super function
class inheritance12 {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Golden Retriever");
        
        myDog.printDetails();
    }
}

class Animal {
    String name;
    
    Animal(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    String breed;
    
    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }
    
    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
    }
}