import java.util.*;
public class LearnStack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        animals.push("Dog");
        animals.push("Lion");
        animals.push("Cat");
        animals.push("Horse");
        animals.push("Elephant");
        System.out.println(animals);

        System.out.println(animals.peek()); // returns the top element

        animals.pop(); // removes the top element
        System.out.println(animals);
        
    }
}
