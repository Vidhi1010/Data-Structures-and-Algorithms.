package OOPS;


class AccessModifiers {
    public String name = "Vidhi";
    private int age = 22;

    public void printData() {
        System.out.println(name + " " + age);
    }

}

public class Constr {

    int modelYear;
    String modelName;


    public Constr(String modelName) {
        // Call the two-parameter constructor to reuse code and set a default year  
        this(2026, modelName);
    }

    public Constr(int modelYear, String modelName) {
        this.modelYear = modelYear;
        this.modelName = modelName;
    }

    public void print() {
        System.out.println(modelYear + " " + modelName);
    }
    public static void main(String[] args) {
        Constr myObj1 = new Constr("Mustang");
        myObj1.print();

        Constr myObj2 = new Constr(1969, "Mustang");
        myObj2.print();


        AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.name);
        //System.out.println(obj.age);//Error: age has private access in AccessModifiers
        obj.printData();
    }
}
