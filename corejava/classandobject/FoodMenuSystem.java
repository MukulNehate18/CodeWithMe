package corejava.classandobject;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

//3. Food Menu System
//Task: Create a FoodItem class with itemId, name, and price. In another class Menu, create an array of FoodItem objects
// and write a method to display the menu and calculate the total price of all items.
//Explanation: The FoodItem class holds food item data, and Menu processes the logic for display and price calculation.
class FoodItems{
    private int price, itemid;
    private String name;

    public FoodItems(int price, String name, int id ){
        this.itemid=id;
        this.name=name;
        this.price=price;
    }
    public int getPrice() {
        return price;
    }

    public int getItemid() {
        return itemid;
    }

    public String getName() {
        return name;
    }
}
class Menu{
    public void display(FoodItems ...f){
        for (int i=0;i<f.length;i++){
            System.out.println("Food ID:"+f[i].getItemid()+" Name:"+f[i].getName()+" Price:"+f[i].getPrice());
        }
    }
}
public class FoodMenuSystem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        FoodItems f[] = new FoodItems[3];
        for (int i=0;i<f.length;i++){
            System.out.println("Enter Food Name: ");
            String name = sc.next();
            System.out.println("Enter Item Id: ");
            int id = sc.nextInt();
            System.out.println("Enter Item Price: ");
            int price = sc.nextInt();

            f[i] = new FoodItems(price, name, id);
        }
        Menu m = new Menu();
        m.display(f);
    }
}
