package Queue;
import java.util.*;

class QueueNode {
    int val;
    QueueNode next;

    QueueNode(int data) {
        val = data;
        next = null;
    }
}

class QueueLinkedList {
    QueueNode Front = null, Rear = null;
    int size = 0;

    boolean Empty() {
        return Front == null;
    }

    int Peek() {
        if (Empty()) {
            System.out.println("Queue is Empty");
            return -1;
        } else
            return Front.val;
    }

    void Enqueue(int value) {
        QueueNode Temp = new QueueNode(value);
        if (Front == null) {
            Front = Temp;
            Rear = Temp;
        } else {
            Rear.next = Temp;
            Rear = Temp;
        }
        System.out.println(value + " Inserted into Queue ");
        size++;
    }

    void Dequeue() {
        if (Front == null) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println(Front.val + " Removed From Queue");
            Front = Front.next;
            if (Front == null) { // If queue becomes empty, update Rear as well
                Rear = null;
            }
            size--;
        }
    }

    public static void main(String args[]) {
        QueueLinkedList Q = new QueueLinkedList();
        Q.Enqueue(10);
        Q.Enqueue(20);
        Q.Enqueue(30);
        Q.Enqueue(40);
        Q.Enqueue(50);
        Q.Dequeue();
        System.out.println("The size of the Queue is " + Q.size);
        System.out.println("The Peek element of the Queue is " + Q.Peek());
    }
}
