package OOPS;

/* class Show {
    int x = 10;
    final int y = 20;
    int a;

    public Show() {
        a = 5;
    }
} */

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}


public class Basic {

    int z;

    // constructor
    public Basic() {
        z = 30;
    }

    public static void main(String[] args) {

        /*
         * Show myObjShow = new Show();
         * myObjShow.x = 15;
         * System.out.println(myObjShow.x);
         * System.out.println(myObjShow.y);
         * System.out.println(myObjShow.a);
         * 
         * Basic myObj = new Basic();//This will call the constructor
         * System.out.println(myObj.z);
         */

        //// declaration + memory for references
        Student[] students = new Student[3];

        // creating objects
        students[0] = new Student(1, "Vidhi");
        students[1] = new Student(2, "Vidhi");
        students[2] = new Student(3, "Vidhi");

        // accessing objects
        for (int i = 0; i < students.length; i++) {
            students[i].display();
        }

    }

}
