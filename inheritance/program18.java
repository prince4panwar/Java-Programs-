//Write a Java program to create an abstract class Animal with abstract methods eat() and sleep(). Create subclasses Lion, Tiger, and Deer that extend the Animal class and implement the eat() and sleep() methods differently based on their specific behavior.
class Animal {
    public void eat()
    {
        System.out.println("eat method");

    }
    public void sleep()
    {
        System.out.println("sleep method");

    }

}
class Bird extends Animal{

    public void eat() {
        super.eat();
        System.out.println("overide eat");
    }


    public void sleep() {
        super.sleep();
        System.out.println("override sleep");
    }

    public void fly()
    {
        System.out.println("in fly method");

    }
}
class Animals1{
    public static void main(String[] args) {
        Animal a =new Animal();
        Bird b = new Bird();
        a.eat();
        a.sleep();
        b.eat();
        b.sleep();
        b.fly();
    }
}
