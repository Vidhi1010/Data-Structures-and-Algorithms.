package Stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Pushing elements into the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("Stack after pushes: " + stack);

        // Peeking the top element
        System.out.println("Top element: " + stack.peek());

        // Popping elements from the stack
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // Checking if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Checking the size of the stack
        System.out.println("Stack size: " + stack.size());
    }
}

