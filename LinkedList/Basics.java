package LinkedList;

import java.util.LinkedList;

public class Basics {

    private Node head; // Head (first node) of the linked list
    private Node tail; // Tail (last node) of the linked list
    private int size; // Size of the linked list

    /*
     * Creates a new node
     * Points it to the current head
     * Updates head
     * If list was empty, sets tail = head
     * Increments size
     */
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head; // New node points to the current head
        head = node; // Update head to the new node

        if (tail == null) {
            tail = head;
        }
        size++; // Increment size
    }

    //constructor to initialize the linked list
    public Basics() {
        this.size = 0; // Initialize size to 0
    }

    private class Node {
        int data; // value stored in node
        Node next; // reference to next node

        // Constructor to create a new node
        Node(int data) {
            this.data = data;
            this.next = null; // initially no next node
        }
    }

    public static void main(String[] args) {
        Basics linkedList = new Basics();

    }
}
