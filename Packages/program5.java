//Create a Java program to create a package with multiple default classes.

package mypackage;

class Class1 {
    void printMessage() {
        System.out.println("This is Class1");
    }

   public static void main(String[] args) {
        Class1 c1 = new Class1();
       

        c1.printMessage();
        
   
}
}
  class Class2 {
    void printMessage() {
        System.out.println("This is Class2");
    }

    public static void main(String[] args) {
        
        Class2 c2 = new Class2();

        
        c2.printMessage();
   
}
}