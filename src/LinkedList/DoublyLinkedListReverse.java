package LinkedList;

public class DoublyLinkedListReverse {
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
        }
    }
    public static Node head;
    public static Node tail;
    public static void reverse(){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.data +"<->");

            temp = temp.prev;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(200);
        Node c = new Node(300);
        Node d = new Node(400);
        Node e = new Node(500);
        Node f = new Node(600);

        head = a;
        tail = f;

        a.next=b;
        a.prev=null;
        b.next=c;
        b.prev=a;
        c.next=d;
        c.prev=b;
        d.next=e;
        d.prev=c;
        e.next=f;
        e.prev=d;
        f.next=null;
        f.prev=e;
        reverse();
    }

}
//insertfirst , insertlast, searching , count , mid , reverse.
