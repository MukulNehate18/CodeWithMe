package corejava.constructor;
//1. Create a Car class
//Create a Car class with fields speed and fuel.
//The default constructor should initialize speed to 60 and fuel to 50.
//Add a method drive() to simulate fuel reduction by 10 units per drive, and display the updated fuel level.
//Explanation: Simulates state changes in objects through method logic

class CarUsed{
    private int fuel, speed;
    public CarUsed(){
        speed=60;
        fuel=50;
    }
    public void drive(){
        System.out.println("Fuel after this ride is "+(fuel-10));
    }
}
public class Car {
    public static void main(String[] args) {
        CarUsed cm= new CarUsed();
        cm.drive();
    }
}
