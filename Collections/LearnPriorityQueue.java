import java.util.*;
public class LearnPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // Min-Heap by default
        //PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // Max-Heap by default
        pq.offer(9);
        pq.offer(2);
        pq.offer(1);
        pq.offer(4);
        System.out.println(pq);

        pq.poll(); // Removes the head of the queue (1)
        System.out.println(pq); // [2, 4, 9]

        System.out.println(pq.peek()); // Returns the head of the queue (2)
        System.out.println(pq.size()); // Returns the size of the queue (3) 
    }
}
