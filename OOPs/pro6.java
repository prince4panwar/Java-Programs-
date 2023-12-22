//Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.
class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    // Constructor
    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Method to calculate salary increase
    public void increaseSalary(double percentage) {
        double increaseAmount = salary * (percentage / 100);
        salary += increaseAmount;
        System.out.println(name + "'s salary increased by " + percentage + "%. New salary: " + salary);
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    // Setter method for job title (optional)
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}

public class pro6 {
    public static void main(String[] args) {
        // Creating an Employee instance
        Employee employee = new Employee("Alice", "Software Engineer", 50000.0);

        // Displaying employee information
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Job Title: " + employee.getJobTitle());
        System.out.println("Salary: " + employee.getSalary());

        // Increasing employee salary by 10%
        employee.increaseSalary(10);
    }
}
