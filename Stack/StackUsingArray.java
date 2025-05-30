package Stack;
class ArrayStack {
    private int arr[];
    private int top;
    private int capacity;

    // Constructor
    public ArrayStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Push operation
    
    public void push(int item) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
         arr[++top] = item;
         System.out.println("Pushed:" + item);
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }
    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Get size of stack
    public int size() {
        return top + 1;
    }

    // Print stack elements
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class StackUsingArray {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);

        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.printStack();

        System.out.println("Peek element: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        stack.printStack();

        System.out.println("Stack size: " + stack.size());
    }
}
