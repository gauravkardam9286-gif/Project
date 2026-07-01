package oops;

class Student {
    String name;
    int age;
    String id;

    // Default constructor
    Student() {
        System.out.println("Constructor called");
    }

    // Parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Parameterized constructor with all fields
    Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("ID: " + this.id);
    }
}

public class demo {
    public static void main(String[] args) {

        Student s1 = new Student("Gaurav", 43, "adx23kdie");
        Student s2 = new Student("riya", 32, "vjfdkjf23d");

        s1.printInfo();
        System.out.println();

        s2.printInfo();

        System.out.println();

        Student s3 = new Student(); // Calls default constructor
    }
}