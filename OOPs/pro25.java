//Create a class, entering the command line arguments from the user and show all the arguments as output..
class Person {
    private String name;
    private int age;
    private String country;

    // Getter and Setter for 'name'
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for 'age'
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and Setter for 'country'
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

 class pro25 {
    public static void main(String[] args) {
        // Creating an instance of Person class
        Person person = new Person();

        // Setting values using setter methods
        person.setName("Alice");
        person.setAge(30);
        person.setCountry("USA");

        // Getting and displaying values using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Country: " + person.getCountry());
    }
}
