package advancejava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Department{
    int id;
    String name;
    String grade;
    Department(int id, String name, String grade){
        this.id = id;
        this.name = name;
        this.grade= grade;
    }
}

public class comparaterInterface {
    public static void main(String[] args) {
        ArrayList <Department> al = new ArrayList();
        al.add(new Department(11,"Abc","A"));
        al.add(new Department(2,"Xyz","B"));
        al.add(new Department(8,"JPG","A"));
        al.add(new Department(1,"KLO","E"));
        al.add(new Department(99,"HUI","C"));
        Comparator<Department> co= new Comparator<Department>() {
            @Override
            public int compare(Department D1, Department D2) {
                if(D1.id > D2.id){
                    return 1;
                }else{
                    return -1;
                }
            }
        };
        Collections.sort(al, co);

        System.out.println("List After sort by ID: ");
        for (Department dept :al){
            System.out.println("ID: "+dept.id+" Name: "+dept.name+" Grade: "+dept.grade);
        }

        Comparator<Department> com= new Comparator<Department>() {
            @Override
            public int compare(Department D1, Department D2) {
                return D1.grade.compareTo(D2.grade);
            }
        };
        Collections.sort(al, com);

        System.out.println("List After sort by Grade: ");
        for (Department dept :al){
            System.out.println("ID: "+dept.id+" Name: "+dept.name+" Grade: "+dept.grade);
        }
    }
}
