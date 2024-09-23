package OOPS;

public class InheritanceJ {
    public static void main(String[] args) {
        
       /*  Fish shark = new Fish();
        shark.eat(); */

        /* Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs); */


        
    }
}

//Base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Mammals extends Animal {
    int legs;
    void walk() {
        System.out.println("walks");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("swims");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("fly");
    }
}

/* 
class Dog extends Mammals {
    String breed;

    void bark() {
        System.out.println("barks");
    }
} */

//Derived class (Child class)
/* class Fish extends Animal {
    int fins;
    void swim() {
        System.out.println("swims in water");
    }
} */