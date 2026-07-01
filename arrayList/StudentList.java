
package arrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentList{
    public static void main(String[] args) {
         ArrayList<String> student = new ArrayList<>();
         Scanner sc = new Scanner(System.in);

         while(true){
            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Remove Student");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Eter Student Name: ");
                    String name = sc.nextLine();
                    student.add(name);
                    System.out.println("Student Added.");
                    break;

                case 2:
                    System.out.println("\nStudent List: ");
                    if(student.isEmpty()){
                        System.out.println("No Students Added.");
                    }else{
                        System.out.println("\nStudent List: ");
                        for(String s : student){
                            System.out.println(s);
                                      
                          }
                        }
                    break;

                case 3:
                    System.out.println("Enter Student Name to Remove: ");
                    String remove = sc.nextLine();
                    
                    if(student.remove(remove)){
                        System.out.println("Student Remove.");
                    }else{
                        System.out.println("Student Not Found.");
                    }
                    break;

                case 4:
                    System.out.println("Program Ended.");
                    return;

                default:
                    System.out.println("Invalid Choice.");
            } 
         }
    }
}