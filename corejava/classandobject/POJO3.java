package corejava.classandobject;
//Q3. WAP to create POJO class name as Laptop with field id, name ,price and ramspace,harddiskspace etc and input the details of laptop and display i

import java.util.Scanner;

class Laptop{
    private int id , price, ram, hard_disk;
    private String name;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getHard_disk() {
        return hard_disk;
    }

    public int getRam() {
        return ram;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHard_disk(int hard_disk) {
        this.hard_disk = hard_disk;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }
}
public class POJO3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Laptop l = new Laptop();
        System.out.print("Enter Id: ");
        l.setId(sc.nextInt());
        System.out.print("Enter Name: ");
        l.setName(sc.next());
        System.out.print("Enter Price: ");
        l.setPrice(sc.nextInt());
        System.out.print("Enter Ram: ");
        l.setRam(sc.nextInt());
        System.out.print("Enter Hard Disk: ");
        l.setHard_disk(sc.nextInt());

        System.out.println("Id \t Name \t Price \t Ram \t Hard Disk");
        System.out.println(l.getId()+"\t"+l.getName()+"\t"+l.getPrice()+"\t"+l.getRam()+"\t"+l.getHard_disk());
    }
}