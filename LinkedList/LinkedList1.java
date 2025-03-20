package LinkedList;

public class LinkedList1 {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    //add First
    public void addFirst(int data) {
        //step1 = create a new node
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        //step2 - newNode next = head
        newNode.next = head;//link

        //step3 - head = newNode
        head = newNode;

    }

    //add Last

    public void addLast(int data) {
        //step1 = create a new node
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public static void main(String[] args) {
        LinkedList1 ll = new LinkedList1();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);

    }
}
