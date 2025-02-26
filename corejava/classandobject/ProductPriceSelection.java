package corejava.classandobject;

import java.util.Scanner;

//1. Product Price Calculation
//Task: Create a Product class with productId, productName, and price. Implement a constructor to initialize these values.
// In another class ProductCatalog, create an array of Product objects and write a method to calculate the total price of all products.
//Explanation: The Product class holds product details, and the ProductCatalog performs logic for price calculation.
class Product{
    private int productid, price;
    private String productname;

    public void setPrice(int price) {
        this.price = price;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public int getProductid() {
        return productid;
    }

    public int getPrice() {
        return price;
    }

    public String getProductname() {
        return productname;
    }
}

class ProductCatalog{
    int total=0;
    public void calc(Product ...p){
        for (int i=0;i<p.length;i++){
            total += p[i].getPrice();
        }
        System.out.println("Total price of all product is "+total);
    }
}

public class ProductPriceSelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product p[]= new Product[3];
        for (int i=0;i<p.length;i++){
            p[i]= new Product();
            System.out.println("Enter Product Id: ");
            p[i].setProductid(sc.nextInt());
            System.out.println("Enter Product Name: ");
            p[i].setProductname(sc.next());
            System.out.println("Enter Product Price: ");
            p[i].setPrice(sc.nextInt());
        }
        ProductCatalog a= new ProductCatalog();
        a.calc(p);
    }
}
