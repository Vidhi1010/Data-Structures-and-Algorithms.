package LinkedList;

public class LinkedListRev {

    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;//It keeps track of how many nodes are currently in the linked list.

    public void addFirst(int data) {
        Node node = new Node(data);
        size++;
        if(head == null) {
            head = node;
            tail = node; // If the list was empty, set tail to head
            return;
        }
        node.next = head; // New node points to the current head
        head = node; // Update head to the new node

    }

    public void addLast(int data) {
        Node node = new Node(data);
        size++;
        if(head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        tail = node; // Update tail to the new node
    }

    public void removeFirst() {
        if(head == null) {
            return;
        }
        head = head.next; // Move head to the next node
        size--;
        if(head == null) {
            tail = null; // If the list is now empty, set tail to null
        }
    }

    public void removeLast() {
        if(head == null) {
            return; // List is empty
        }
        if(head == tail) {
            head = null;
            tail = null;
            size--;
            return;
        }

        Node temp = head;
        while(temp.next != tail) {
            temp = temp.next; // Traverse to the second last node
        }
        temp.next = null; // Remove the last node
        tail = temp; // Update tail to the second last node
        size--;
    }

    public void removeByValue(int data) {
        if(head == null) {
            System.out.println("List is empty, cannot remove value: " + data);
            return; // List is empty
        }
        // Case 1: Value is at the head
        if(head.data == data) {
            head = head.next; // Move head to the next node
            size--;
            if(head == null) {
                tail = null; // If the list is now empty, set tail to null
            } return;
        }

        // Case 2: Value is somewhere in middle or end
        Node temp = head;
        while(temp.next != null && temp.next.data != data) {
            temp = temp.next; // Traverse until we find the node with the value
        }

        if(temp.next == null) {
            System.out.println("Value " + data + " not found in the list.");
            return; // Value not found
        }

        // temp.next is the node to be deleted
        if(temp.next == tail) {
            tail = temp; // Update tail if we are removing the last node
        }

        temp.next = temp.next.next; // Bypass the node to be deleted
        size--;

    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        LinkedListRev list = new LinkedListRev();
        list.addFirst(10);
        list.addFirst(52);
        list.addLast(15);
        list.addLast(20);
        list.addFirst(5);
        list.removeFirst();
        list.removeLast();
        list.printList(); // Should print: 52->10->15->null
    }
}
