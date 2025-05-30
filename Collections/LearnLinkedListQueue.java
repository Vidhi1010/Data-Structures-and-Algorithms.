import java.util.*;
public class LearnLinkedListQueue {
    public static void main(String[] args) {
        // Queue is a data structure that follows FIFO (First In First Out) principle
        // It is used to store elements in a linear order
        // It is implemented using LinkedList or ArrayList

        Queue<String> queue = new LinkedList<>();

        queue.offer("Vidhi");
        queue.offer("Vaibhav");
        queue.offer("Sneha");

        queue.add("Vivek");//On Failure Throws exception (IllegalStateException), Use when you're sure there's space

        queue.offer("Sweta");//On Failure Returns false, no exception, Use when you're not sure, safer
 
        System.out.println(queue); // [Vidhi, Vaibhav, Sneha, Vivek]

        System.out.println(queue.peek()); // returns the head of the queue (Vidhi)

        queue.poll(); // removes the head of the queue (Vidhi)
        System.out.println(queue); // [Vaibhav, Sneha, Vivek]

        System.out.println(queue.size()); // returns the size of the queue (3)


    
    }
}
