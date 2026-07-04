package LinkedList;
class LL{
class Node{
    String data;
    Node next;

    Node(String data){
        this.data = data;
        this.next = null;
    }
}
}
//add - first and last
public void addFirst(String data){
    Node newNode = new Node(data);
    Node head;
    if(head == null){
        head = newNode;
        return;

    }

    newNode.next = head;
    head = newNode;
} 

public void addLast(String data, Node head){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
        return;
    }

    Node currNode = head;
    while(currNode.next != null){
        currNode = currNode.next;
    }
    currNode.next = newNode;
}


//print
public void printList(){
    if(head == null){
        System.out.println("List is empty");
        return;
    }
    Node currNode = head;
    while(currNode.next != null){
        System.out.print(currNode.data + " -> ");
        currNode = currNode.next;
    }
    System.out.println("NULL");
}
public class demo {
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
         
        
    }
    
    
}
