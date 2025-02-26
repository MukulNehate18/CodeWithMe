package corejava.constructor;
//4. Car Mileage Calculator
//Create a Car class with fields make, model, milesDriven, and fuelUsed.
// Add a method to calculate mileage (milesDriven / fuelUsed).
//Explanation: Ensure proper handling of edge cases like zero fuel.
class Car1{
    private String  model;
    private int milesDriven, fuelUsed;
    public Car1(){
        model="Skoda";
    }
    public void calcMilege(int a,int b){
        milesDriven=a;
        fuelUsed=b;
        System.out.println("Milege is "+(a/b));
    }
}

public class MilegeCar {
    public static void main(String[] args) {
        Car1 cc = new Car1();
        cc.calcMilege(633,78);
    }
}
