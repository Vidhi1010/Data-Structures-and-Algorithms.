package OOPS;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

}

public class Basic {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20);
        System.out.println(student1);
    }
}
