import java.util.*;
public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>(); // Double-ended queue
        deque.offer(25);
        deque.offerFirst(26);
        deque.offerLast(22);
        deque.offer(29);

        System.out.println(deque);

        System.out.println(deque.peek());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        System.out.println(deque.poll()); // Removes the head of the deque (26)
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        
    }
}
