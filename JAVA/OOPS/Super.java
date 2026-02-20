package OOPS;

//the super keyword is used to refer to the parent class of a subclass.
//The most common use of the super keyword is to eliminate the confusion between superclasses and subclasses that have methods with the same name.
//It can be used in two main ways:

//To access attributes and methods from the parent class
//To call the parent class constructor

class Animal {

    String type = "animal";

    public void animalSound() {
        System.out.println("The animal makes the sound");
    }

    Animal() {
        System.out.println("Animal is created");
    }
}

class Dog extends Animal {

    String type = "Dog";

    //// Access parent attribute
    public void printData() {
        System.out.println(super.type);
    }

    //Access Parent Methods
    public void animalSound() {
        super.animalSound();
        System.out.println("Dog barks");
    }

    //super() to call the constructor of the parent class. This is especially useful for reusing initialization code.

    Dog() {
        super(); // Call parent constructor
        System.out.println("Dog is created");
    }

}

public class Super {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.animalSound();
        obj.printData();
    }
}
