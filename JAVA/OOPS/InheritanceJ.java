package OOPS;

//If you don't want other classes to inherit from a class, use the final keyword

class Vehicle {
  protected String brand = "Ford";        // Vehicle attribute
  public void honk() {                    // Vehicle method
    System.out.println("Tuut, tuut!");
  }
}


class Car extends Vehicle {
    protected String modelName = "Mustang";
}

public class InheritanceJ {
    public static void main(String[] args) {
      
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.modelName + " " + myCar.brand);
    }
}

