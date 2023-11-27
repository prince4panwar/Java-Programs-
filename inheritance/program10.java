//Write a Java program that creates a class hierarchy for employees of a company. The base class should be Employee, with subclasses Manager, Developer, and Programmer. Each subclass should have properties such as name, address, salary, and job title. Implement methods for calculating bonuses, generating performance reports, and managing projects.
class employee{

    private String name;
    private String address;
    private double salary;
    private String jobTitle;

    public employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double calBonus() {
         return 0.0;
    }

    public String Performance() {
         return "No performance report available.";
    }
}

class manager extends employee {
    private int subordinates;

    public manager(String name, String address, double salary, String jobTitle, int subordinates) {
        super(name, address, salary, jobTitle);
        this.subordinates = subordinates;
    }

    public int subordinates() {
        return subordinates;
    }
    public double calBonus() {
       return getSalary() * 0.15;
    }
    public String Performance() {
        return "Performance report for Manager " + getName() + ": Excellent";
    }

    public void manageProject() {
       System.out.println("Manager " + getName() + " is managing a project.");
    }
}

class programmer extends developer {
    public programmer(String name, String address, double salary, String pLanguage) {
        super(name, address, salary,"Programmer", pLanguage );
    }
    public double calBonus() {
        return getSalary() * 0.12;
    }
    public String Performance() {
        return "Performance report for Programmer " + getName() + ": Excellent";
    }

    public void debugCode() {
        System.out.println("Programmer " + getName() + " is debugging code in " + getPLanguage());
    }
}
 

class developer extends employee {
    private String pLanguage;

    public developer(String name, String address, double salary, String jobTitle, String pLanguage) {
        super(name, address, salary, jobTitle);
        this.pLanguage = pLanguage;
    }

    public String getPLanguage() {
        return pLanguage;
    }

    public double calBonus() {
       return getSalary() * 0.10;
    }

    public String Performance() {
       return "Performance report for Developer " + getName() + ": Good";
    }

    public void writeCode() {
        System.out.println("Developer " + getName() + " is writing code in " + pLanguage);
    }
}

 class Main{
    public static void main (String args[] ) {
        manager man = new manager("Ajay", "1 ABC Sec-1, chd", 80000.0, "Manager", 5);
        developer dev = new developer("Rahul", "2 xyz Sec-18, chd", 72000.0, "Developer", "Java");
        programmer pro = new programmer("Rohit", "3 ABC Mohali", 76000.0, "Python");

        System.out.println("Manager's Bonus: Rs." + man.calBonus());
        System.out.println("Developer's Bonus: Rs." + dev.calBonus());
        System.out.println("Programmer's Bonus: Rs." + pro.calBonus());

        System.out.println(man.Performance());
        System.out.println(dev.Performance());
        System.out.println(pro.Performance());

        man.manageProject();
        dev.writeCode();
        pro.debugCode();
    }
}
