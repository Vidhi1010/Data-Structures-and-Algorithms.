package OOPS;

//The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:
//1. declare class variables/attributes as private
//2. provide public get and set methods to access and update the value of a private variable

class Person {


    private String name; //hidden data

    //getter method
    public String getName() {
        return name;
    }

    //setter method
    public void setName(String newName) {
        this.name = newName;
    }
}

public class Encapsulation {

    
    public static void main(String[] args) {
        Person obj = new Person();
        obj.setName("Vidhi");
        System.out.println(obj.getName());//Vidhi

    }
}
