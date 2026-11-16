package LinkedList;

public class Node {
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        
        a.next = b;
        b.next=c;
        c.next=d;

        System.out.print(a.data +"->");
        System.out.print(a.next.data +"->");
        System.out.print(a.next.next.data +"->");
        System.out.print(a.next.next.next.data );

    }




}
