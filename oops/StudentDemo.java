package oops;
class Student{
    String name;
    int age;
    String id;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.id);
    }

    Student(){
        System.out.println("Constructor called");
    }
}

public class StudentDemo {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Gaurav";
        s1.age = 23;
        s1.id = "adx23kdie";
        

        Student s2 = new Student();
        s2.name = "Shifa";
        s2.age  = 13;
        s2.id = "vjfdkjf23d";

        s1.printInfo();
        System.out.println();
        s2.printInfo();
    }    
}
