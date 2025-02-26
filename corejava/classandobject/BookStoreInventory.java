package corejava.classandobject;
//3. Bookstore Inventory:
//Create a Book class with fields isbn, title, and price.
//In the InventoryManager class, create methods to apply a discount to the price
//of a book and display the book details with the new price after the discount.
import java.util.Scanner;

class Book1{
    private int price;
    private String title;

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }
}

class InventoryManager{
    public void discount(Book1 ...b){
        for (int i=0;i<b.length;i++){
            System.out.println("Book Title: "+b[i].getTitle());
            System.out.println("Book Price: "+b[i].getPrice());
            System.out.println("After Discount it's Price will be "+(b[i].getPrice()-((20*b[i].getPrice())/100) ));
        }
    }
}
public class BookStoreInventory {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Book1 b[]= new Book1[1];
        for (int i=0;i<b.length;i++){
            b[i]= new Book1();
            System.out.println("Enter Book Title: ");
            b[i].setTitle(sc.next());
            System.out.println("Enter Book Price: ");
            b[i].setPrice(sc.nextInt());
        }
        InventoryManager im= new InventoryManager();
        im.discount(b);
    }
}
