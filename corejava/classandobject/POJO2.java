package corejava.classandobject;
//Q2. WAP to create POJO class name as Book  with field id,name and price and author and input the book details and display it.

import java.util.Scanner;

class Book{
    private int id;
    private String name;
    private int price;
    private String author;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }
}
public class POJO2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Book b = new Book();
        b.setId(11);
        b.setName("The World");
        b.setPrice(200);
        b.setAuthor("William Smith");

        Book b2 = new Book();
        System.out.print("Enter book id: ");
        b2.setId(sc.nextInt());
        System.out.print("Enter book name: ");
        b2.setName(sc.next());
        System.out.print("Enter book price: ");
        b2.setPrice(sc.nextInt());
        System.out.print("Enter book author: ");
        b2.setAuthor(sc.next());

        System.out.println("Name: "+b.getName()+" Id: "+b.getId()+" Run: "+b.getAuthor()+" Price: "+ b.getPrice());
        System.out.println("Name: "+b2.getName()+" Id: "+b2.getId()+" Run: "+b2.getAuthor()+" Price: "+ b2.getPrice());

    }
}
