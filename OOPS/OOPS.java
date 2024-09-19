package OOPS;

public class OOPS {
    public static void main(String[] args) {

        Pen p1 = new Pen();//constructor.....created a pen object called p1

        p1.setColor("Blue");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());

        p1.setColor("Red");
        System.out.println(p1.getColor());

        /* BankAccount myAcc = new BankAccount();
        myAcc.username = "Vidhi";
        myAcc.setPassward("123@Vidhi"); */

        /*  // Create an object of the Car class
         Car myCar = new Car("Red", "Toyota", 0);
        
         // Access object attributes
         System.out.println(myCar.model); // Output: Toyota
         
         // Call object methods
         myCar.accelerate(); 
         System.out.println(myCar.speed); // Output: 10 */

    }
    
}

/* class BankAccount {
    public String username;
    private String password;

    public void setPassward(String pwd) {
        password = pwd;
    }
} */
class Pen {
    private String color;// Instance variable
    private int tip;// Instance variable

    //getter
    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    //setter
    void setColor(String newColor) {
        this.color = newColor;// 'this.color' refers to the instance variable, 'newColor' is the method parameter
    }

    void setTip(int  newTip) {
        this.tip = newTip;// 'this.tip' refers to the instance variable, 'newTip' is the method parameter
    }
}

// Define a class
class Car {
    // Attributes (properties)
    String color;
    String model;
    int speed;

    // Constructor (initializes the object)
    Car(String color, String model, int speed) {
        // 'this.model' refers to the instance variable
        this.color = color;
        this.model = model;
        this.speed = speed;
    }

    // Methods (behaviors)
    void accelerate() {
        speed += 10;
    }

    void brake() {
        speed -= 10;
    }
}
