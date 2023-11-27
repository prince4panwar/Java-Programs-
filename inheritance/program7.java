 
 //Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method to include the employee's job title

class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Employee extends Person {
    private int employeeId;
    private String jobTitle;

    public Employee(String firstName, String lastName, int employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    
    public String getLastName() {
        return super.getLastName() + " (" + jobTitle + ")";
    }
}

class PersonAndEmployeeExample {
    public static void main(String[] args) {
        Person person = new Person("Bharat", "Bhatt");
        Employee employee = new Employee("Ravi", "Bhatt", 12345, "Software Engineer");

        System.out.println("Person: " + person.getFirstName() + " " + person.getLastName());
        System.out.println("Employee: " + employee.getFirstName() + " " + employee.getLastName() + ", Employee ID: " + employee.getEmployeeId());
    }
}