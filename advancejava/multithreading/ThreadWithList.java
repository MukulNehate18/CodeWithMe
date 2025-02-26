package advancejava.multithreading;

import java.util.ArrayList;
import java.util.List;

class Student {
    int id;
    String name;
    Student(int id, String name){
        this.id= id;
        this.name= name;
    }

    public static void main(String[] args) {
        List<Student> l = new ArrayList<>();
        l.add(new Student(1, "A"));
        l.add(new Student(2, "B"));
        l.add(new Student(3, "C"));
        l.add(new Student(4, "D"));
        l.add(new Student(5, "E"));

    }
}
