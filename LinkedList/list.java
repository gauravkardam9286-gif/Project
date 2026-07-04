package LinkedList;
class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
}


public class list {
    public static void main(String[] args) {
        Node first = new Node(34);
        Node second = new Node(343);
        Node third = new Node(31);
        Node four = new Node(43);

        first.next = second;
        second.next = third;
        third.next = four;

        // insert at Beginnig

        Node newNode = new Node(4);
        newNode.next = first;
        first = newNode;

        // insert at end
        Node newNode1 = new Node(2);
        Node end = first;
        while(end.next != null){
            end = end.next;
        }
        end.next = newNode1;

        first = first.next;

        Node temp = first;
        while(temp != null){
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.println("null");
    }

}
