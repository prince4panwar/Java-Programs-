//Write a Java program to create a class called Animal with a method named move(). Create a subclass called Cheetah that overrides the move() method to run.

class animal{
    public void move(){
        System.out.println("animal is moving");

    }
}
class cheetah{
    public void move(){
        System.out.println("cheetah is running: ");
    }
}
class inheritence_6_7032{
    public static void main(String[] args) {
        animal A=new animal();
        A.move();
        cheetah C=new cheetah();
        C.move();
        
    }
}