package OOPS;

public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = " Vidhi";
        s1.roll = 07;
        s1.passward = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 98;

        // copy constructor
        Student s2 = new Student(s1);
        s2.passward = "xyz";
        s1.marks[2] = 100;

       for(int i = 0; i < 3; i++) {
        System.out.println(s2.marks[i]);
       }

        /* Student s2 = new Student("Vidhi");
        System.out.println(s2.name); */
    }
}

class Student {
    String name;
    int roll;
    String passward;
    int marks[];

    //copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }

    Student() {
        marks = new int[3];
        System.out.println("Default or Non parameterized constructor");
    }

    //parameterized constructor
    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}