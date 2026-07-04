package LinkedList;
class Student{
    String name;
    int id;
    int roll;
    int standard;
    Student next;
    
        Student(String name, int id, int roll, int standard){
        this.name = name;
        this.id = id;
        this.roll = roll;
        this.standard = standard;
        this.next = null;
    }
}
class StudentLinkedList{
    Student head;
    
    // add first
    public void addFirst(String name, int id, int roll, int standard){
        Student newstudent = new Student(name, id, roll, standard);
        newstudent.next = head;
        head = newstudent;
        
        
    }
    // add last
    public void addLast(String name, int id, int roll, int standard){
        
        Student newstudent = new Student(name,id,roll,standard);
        if(head == null){
            head = newstudent;
            return;
        }
        Student temp = head;
        
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newstudent;
        
    }
    
// display all
    public void display(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Student temp = head;
        
        while(temp != null){
            System.out.println("----------------");
            System.out.println("Name     : "+temp.name);
            System.out.println("Id       : " + temp.id);
            System.out.println("Roll No  : "+temp.roll);
            System.out.println("Standard : "+ temp.standard);
            temp = temp.next;
        
    }
    }
    public void count(){
        int count = 0;
        Student temp = head;
        while(temp != null){
            count ++;
            temp = temp.next;
        }
        System.out.println("Total Student : "+ count);
    }
}

public class Mainstudent {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();
        list.addLast("rohan", 24,3,12);
        list.addLast("aman", 242,4,11);
        list.addLast("salu", 2432,5,10);
        list.addFirst("gaurav", 34,23,12);
        list.addFirst("shifa", 34,32,54);
        list.display();
        list.count();
        
    }
}