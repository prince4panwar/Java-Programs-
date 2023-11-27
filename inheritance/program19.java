//Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and displayInfo(). Create subclasses Manager and Programmer that extend the Employee class and implement the respective methods to calculate salary and display information for each role.
abstract class Employee {
  public abstract void calculateSalary();

   public abstract  void displayInfo() ;
}

class Manager extends Employee {
    public void calculateSalary() {
        System.out.println("your salary is : 60,0000/-");
    }
    public void displayInfo() {
        System.out.println("name: Gaurav");
        System.out.println("Dept: IT");
        System.out.println("Designation: Manager");
    }
}

class Programmer extends Employee {
    
    public void calculateSalary() {
        System.out.println("your salary is : 80,000/-");
    }
    public void displayInfo() {
        System.out.println("name: yash");
        System.out.println("Dept: IT");
        System.out.println("Designation: Programmer");
    }
}
class M {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Programmer programmer = new Programmer();

        manager.displayInfo();
        manager.calculateSalary();
        programmer.displayInfo();
        programmer.calculateSalary();
    }
}
