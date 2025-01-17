package advancejava;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
    int id;
    String name;
    Student(int id, String name){
        this.id= id;
        this.name= name;
    }
    public int compareTo(Student std){
        if(this.id > std.id){
            return 1;
        }else {
            return -1;
        }
    }
}

public class comparableInterface {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList();
        al.add(new Student(5,"ams"));
        al.add(new Student(7,"dyy"));
        al.add(new Student(12,"dssf"));
        al.add(new Student(2,"qwwe"));
        al.add(new Student(6,"opp"));

        Collections.sort(al);
        for (Student std:al){
            System.out.println("ID: "+std.id+" Name: "+std.name);
        }
    }
}
