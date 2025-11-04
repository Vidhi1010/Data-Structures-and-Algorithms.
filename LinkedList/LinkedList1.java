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
    public static int size;//It keeps track of how many nodes are currently in the linked list.

    // add First - O(1)
    public void addFirst(int data) {
        // step1 = create a new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        // step2 - newNode next = head
        newNode.next = head;// link

        // step3 - head = newNode
        head = newNode;

    }

    // add Last - O(1)
    public void addLast(int data) {
        // step1 = create a new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    //add in the middle //O(n)
    public void addMiddle(int idx, int data) {
        
        if(idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i < idx-1) {
            temp = temp.next;
            i++;
        }
        // i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void middle(int index, int data) {
        if(index == 0) {
            addFirst(data);
            return;
        }
        if(index == size) {
            addLast(data);
            return;
        }
        
        Node temp = head;
        int i = 0;
        while(i < index - 1) {
            temp = temp.next;
            i++;
        }
        Node newNode = new Node(data);
        size++;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //Remove from first
    public int removeFirst() {
        if(size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MAX_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    //Remove from last
    public int removeLast() {
        if(size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MAX_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next; // temp will be at second last node
        }
        int val = temp.next.data; // last node data
        temp.next = null; // remove last node
        tail = temp; // update tail
        size--;
        return val;
    }
    public void print() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        LinkedList1 ll = new LinkedList1();
    
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addMiddle(2,5);
        ll.print();
        System.out.println(ll.size);
        ll.removeFirst();
        ll.print();

    }
}
