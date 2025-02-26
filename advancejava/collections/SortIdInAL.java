package advancejava.collections;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
    int id;
    String name;
    public Employee(int id, String name){
        this.id =id;
        this.name=name;
    }
    public int compareTo(Employee e){
        if (this.id>e.id){
            return 1;
        }else{
            return -1;
        }
    }

}

public class SortIdInAL {
    public static void main(String[] args) {
        ArrayList<Employee> a= new ArrayList<>();
        a.add(new Employee(23, "Mukul"));
        a.add(new Employee(11, "Chaitanya"));
        a.add(new Employee(43, "Deepak"));
        a.add(new Employee(22, "Om"));
        a.add(new Employee(76, "Raj"));
        a.add(new Employee(81, "Dheeraj"));
        Collections.sort(a);
        for (Employee e:a){
            System.out.println("ID:"+e.id+" Name:"+e.name);
        }
    }
}
