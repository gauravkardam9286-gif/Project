package oops;

class Employe{

    String name;
    int age;

    public void printdata(String name){
        System.out.println(name);
    }
    public void printdata(int age){
        System.out.println(age);
    }
    public void printdata(String name, int age){
        System.out.println(name + " " + age);
    }
}
public class printdata{
    public static void main(String args[]){
        Employe s1 = new Employe();
        s1.name = "Gaurav";
        s1.age = 23;

        s1.printdata(s1.age);

    }
}
