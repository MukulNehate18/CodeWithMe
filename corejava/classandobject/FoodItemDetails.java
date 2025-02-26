package corejava.classandobject;
//2. Food Item Details:
//Create a FoodItem class with fields itemName, price, and calories.
//In a FoodOrder class, implement a method to calculate the total price of multiple items, considering their prices.

import java.util.Scanner;

class FoodItem{
    private int price, calories;
    private String itemname;

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public int getPrice() {
        return price;
    }

    public int getCalories() {
        return calories;
    }

    public String getItemname() {
        return itemname;
    }
}
class FoodOrder{
    public void calculate(FoodItem ...f){
        Scanner sc = new Scanner(System.in);
        int Total=0;
        for (int i=0;i<f.length;i++){
            System.out.println("Enter number of "+f[i].getItemname()+": ");
            int n =sc.nextInt();
            Total =Total+( n* f[i].getPrice() );
        }
        System.out.println("Total Amount is "+Total);
    }
}
public class FoodItemDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FoodItem fi[]= new FoodItem[3];
        for (int i=0;i< fi.length;i++){
            fi[i]=new FoodItem();
            System.out.println("Enter a Food Item: ");
            fi[i].setItemname(sc.next());
            System.out.println("Enter a Food Price: ");
            fi[i].setPrice(sc.nextInt());
            System.out.println("Enter a Food Calories: ");
            fi[i].setCalories(sc.nextInt());
        }
        FoodOrder o = new FoodOrder();
        o.calculate(fi);
    }
}
