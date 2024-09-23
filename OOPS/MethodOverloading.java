package OOPS;

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.sum(10, 20));
        System.out.println(c1.sum(1.5f, 2.5f));
        System.out.println(c1.sum(10, 20, 30));


        Deer d = new Deer();
        d.eat();
    }
}
class Animal {
    void eat() {
        System.out.println("eats anything");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("eats grass");
    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}