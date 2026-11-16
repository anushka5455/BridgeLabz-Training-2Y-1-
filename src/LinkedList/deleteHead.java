package LinkedList;

public class deleteHead {
    public static class Node {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
        }
    }
    public static Node head;
    public static Node tail;

    public static void delete(){
    if(head==null){
        return;
    }
    head = head.next;
    if(head == null){
        tail = null;
        return;
    }
    }

    public static void main(String[] args) {
        Node a  = new Node(10);
        Node b  = new Node(20);
        Node c  = new Node(30);
        Node d  = new Node(40);
        Node e  = new Node(50);

        head = a;
        tail = e;
        a.next = b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=null;
delete();
    }
}
