//Write a Java program to create a class called "School" with attributes for students, teachers, and classes, and methods to add and remove students and teachers, and to create classes.
class Student {
    private String name;
    private int grade;

    // Constructor
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
}

class Teacher {
    private String name;
    private String subject;

    // Constructor
    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }
}

class School {
    private Student[] students;
    private Teacher[] teachers;
    private String[] classes;
    private int numStudents;
    private int numTeachers;
    private int numClasses;

    // Constructor
    public School(int maxStudents, int maxTeachers, int maxClasses) {
        students = new Student[maxStudents];
        teachers = new Teacher[maxTeachers];
        classes = new String[maxClasses];
        numStudents = 0;
        numTeachers = 0;
        numClasses = 0;
    }

    // Method to add a student
    public void addStudent(Student student) {
        if (numStudents < students.length) {
            students[numStudents] = student;
            numStudents++;
            System.out.println("Student added: " + student.getName());
        } else {
            System.out.println("Cannot add more students. School is full.");
        }
    }

    // Method to remove a student
    public void removeStudent(String studentName) {
        boolean found = false;
        for (int i = 0; i < numStudents; i++) {
            if (students[i].getName().equalsIgnoreCase(studentName)) {
                found = true;
                System.out.println("Student removed: " + students[i].getName());
                for (int j = i; j < numStudents - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[numStudents - 1] = null;
                numStudents--;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found: " + studentName);
        }
    }

    // Method to add a teacher
    public void addTeacher(Teacher teacher) {
        if (numTeachers < teachers.length) {
            teachers[numTeachers] = teacher;
            numTeachers++;
            System.out.println("Teacher added: " + teacher.getName());
        } else {
            System.out.println("Cannot add more teachers. School is full.");
        }
    }

    // Method to remove a teacher
    public void removeTeacher(String teacherName) {
        boolean found = false;
        for (int i = 0; i < numTeachers; i++) {
            if (teachers[i].getName().equalsIgnoreCase(teacherName)) {
                found = true;
                System.out.println("Teacher removed: " + teachers[i].getName());
                for (int j = i; j < numTeachers - 1; j++) {
                    teachers[j] = teachers[j + 1];
                }
                teachers[numTeachers - 1] = null;
                numTeachers--;
                break;
            }
        }
        if (!found) {
            System.out.println("Teacher not found: " + teacherName);
        }
    }

    // Method to create a class
    public void createClass(String className) {
        if (numClasses < classes.length) {
            classes[numClasses] = className;
            numClasses++;
            System.out.println("Class created: " + className);
        } else {
            System.out.println("Cannot create more classes. Limit reached.");
        }
    }
}

public class pro14 {
    public static void main(String[] args) {
        // Creating a School instance
        School school = new School(20, 5, 10); // Assuming limits for 20 students, 5 teachers, and 10 classes

        // Adding students
        Student student1 = new Student("Alice", 10);
        Student student2 = new Student("Bob", 9);

        school.addStudent(student1);
        school.addStudent(student2);

        // Removing a student
        school.removeStudent("Bob");

        // Adding teachers
        Teacher teacher1 = new Teacher("Mr. Smith", "Math");
        Teacher teacher2 = new Teacher("Ms. Johnson", "Science");

        school.addTeacher(teacher1);
        school.addTeacher(teacher2);

        // Removing a teacher
        school.removeTeacher("Ms. Johnson");

        // Creating classes
        school.createClass("Mathematics");
        school.createClass("Science");
    }
}
