package oops;
class employe{
    int id;
    String name;
    int salary;

    public void printDetails(){
        System.out.println("my name is "+name);
        System.out.println("my id is "+ id);
        System.out.println("my salary is "+ salary);
    }
    // public void getsalary(){
    //     System.out.println("my salary is "+ salary);
    // }

}
public class dataEmploye{
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        employe harray = new employe();
        employe shifa = new employe();
        employe Gaurav = new employe();
        employe aman = new employe(); // Instantiatingg a new Employee Object
      
      
        // setting properties 
        harray.salary = 129304;
        shifa.salary = 323244;
        Gaurav.salary = 344343;
        aman.salary = 323321;

        harray.name = "code with harray";
        harray.id = 123;
        shifa.name = "shifa";
        Gaurav.name = "Gaurav";
        aman.name = "aman";
        shifa.id = 1232;
        aman.id = 143;
        Gaurav.id = 2124;

        harray.printDetails();
        Gaurav.printDetails();
        shifa.printDetails();
        aman.printDetails();
        // int salary = shifa.getsalary();
        // System.out.println(salary);
        
    }
}