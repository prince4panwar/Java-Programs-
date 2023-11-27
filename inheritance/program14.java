// Create a program, showing an example of dynamic method dispatch
class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("The cat meows.");
    }
}

class test {
    public static void main(String[] args) {
        Animal myAnimal;
        myAnimal = new Dog();
        myAnimal.makeSound(); 
        

        myAnimal = new Cat();
        myAnimal.makeSound(); 
        
    }
}
