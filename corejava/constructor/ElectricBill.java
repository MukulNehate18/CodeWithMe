package corejava.constructor;
//3. Electricity Bill Calculation
//Create a Customer class with fields customerName, customerID, and unitsConsumed.
// Add a method to calculate the bill amount based on units consumed (slab rates).
//Explanation: Implement a tiered billing system with logic for each slab.

class Customer{
    private String customerName;
    private int customerID, unitsConsumed;
    public Customer(int x){
        customerID=1232;
        customerName="mukul";
        unitsConsumed=x;
    }
    public void Bill(){
        System.out.println("Total Bill is "+(unitsConsumed*10));
    }
}
public class ElectricBill {
    public static void main(String[] args) {
        Customer s=new Customer(29);
        s.Bill();
    }
}
