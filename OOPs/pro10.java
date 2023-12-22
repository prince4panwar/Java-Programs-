//Write a Java program to create a class called "Student" with a name, grade, and courses attributes, and methods to add and remove courses.
class Student {
    private String name;
    private int grade;
    private String[] courses;
    private int numCourses;

    // Constructor
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new String[10]; // Assuming maximum 10 courses
        this.numCourses = 0;
    }

    // Method to add a course
    public void addCourse(String course) {
        if (numCourses < courses.length) {
            courses[numCourses] = course;
            numCourses++;
            System.out.println("Course added: " + course);
        } else {
            System.out.println("Cannot add more courses. Maximum courses reached.");
        }
    }

    // Method to remove a course
    public void removeCourse(String course) {
        boolean found = false;
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                found = true;
                System.out.println("Course removed: " + course);
                // Shift courses to fill the gap
                for (int j = i; j < numCourses - 1; j++) {
                    courses[j] = courses[j + 1];
                }
                courses[numCourses - 1] = null;
                numCourses--;
                break;
            }
        }
        if (!found) {
            System.out.println("Course not found: " + course);
        }
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public String[] getCourses() {
        return courses;
    }

    public int getNumCourses() {
        return numCourses;
    }
}

public class pro10 {
    public static void main(String[] args) {
        // Creating a Student instance
        Student student = new Student("Alice", 10);

        // Adding courses
        student.addCourse("Math");
        student.addCourse("Science");
        student.addCourse("History");

        // Displaying courses
        System.out.println("Courses for " + student.getName() + " (Grade " + student.getGrade() + "):");
        String[] courses = student.getCourses();
        for (int i = 0; i < student.getNumCourses(); i++) {
            System.out.println("- " + courses[i]);
        }

        // Removing a course
        student.removeCourse("Science");

        // Displaying courses after removal
        System.out.println("\nCourses after removal:");
        courses = student.getCourses();
        for (int i = 0; i < student.getNumCourses(); i++) {
            System.out.println("- " + courses[i]);
        }
    }
}
