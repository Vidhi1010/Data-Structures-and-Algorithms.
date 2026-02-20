package OOPS;

//Abstract class
abstract class Animal {

    // Abstract method (no body)
    //An abstract method is a method that has NO body. Only name, Only rule, No work inside
    abstract void sound();
}

//child class

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}


//another child class

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class NonStatic {

    //A static method belongs to the class itself. You can call it without creating an object, but it cannot use variables or methods that belong to an object.
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }


    public static void main(String[] args) {
        myStaticMethod();//without creating objects



        Animal a1 = new Dog();
        a1.sound();

        Animal a2 = new Cat();
        a2.sound();
    }
}
