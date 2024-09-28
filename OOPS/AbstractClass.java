package OOPS;

public class AbstractClass {
    public static void main(String[] args) {
       /*  Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color); */

        /* Chicken c = new Chicken();
        c.eat();
        c.walk();
 */
        //Animal a = new Animal();

        Mustang a = new Mustang();
    }
}

abstract class Animal {

    String color;
    
    Animal() {
        //color = "brown";
        System.out.println("animal constructer called");
    }
    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("horse constructor called");
    }

    void changeColor() {
        color = "black";
    }
    void walk() {
        System.out.println("horse walks");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("mustang constructor called");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "white";
    }
    void walk() {
        System.out.println("chicken walks");
    }
}