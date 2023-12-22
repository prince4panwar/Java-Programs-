//Write a Java program to create a class called Employee with private instance variables employee_id, employee_name, and employee_salary. Provide public getter and setter methods to access and modify the id and name variables, but provide a getter method for the salary variable that returns a formatted string.


class Employee {
    private int employee_id;
    private String employee_name;
    private double employee_salary;

    // Getter and Setter for 'employee_id'
    public int getEmployeeId() {
        return employee_id;
    }

    public void setEmployeeId(int employee_id) {
        this.employee_id = employee_id;
    }

    // Getter and Setter for 'employee_name'
    public String getEmployeeName() {
        return employee_name;
    }

    public void setEmployeeName(String employee_name) {
        this.employee_name = employee_name;
    }

    // Getter for 'employee_salary' with formatted output
    public String getEmployeeSalary() {
        return String.format("%.2f", employee_salary);
    }

    // Setter for 'employee_salary'
    public void setEmployeeSalary(double employee_salary) {
        this.employee_salary = employee_salary;
    }
}

public class pro29 {
    public static void main(String[] args) {
        // Creating an instance of Employee class
        Employee emp = new Employee();

        // Setting values using setter methods
        emp.setEmployeeId(101);
        emp.setEmployeeName("John Doe");
        emp.setEmployeeSalary(5000.0);

        // Getting and displaying values using getter methods
        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Employee Name: " + emp.getEmployeeName());
        System.out.println("Employee Salary: $" + emp.getEmployeeSalary());
    }
}
