package miniproject;
//Problem Requirements
//Create an abstract class Vehicle with the following:
//
//Attributes: String name, int speed
//Constructor to initialize attributes
//Abstract method void move(String signalState) (to define movement logic)
//Method void display() to print vehicle details
//Create three subclasses:
//
//Car: Moves only when the signal is "Green"
//Bike: Moves when the signal is "Green" but slows down for "Yellow"
//EmergencyVehicle (like Ambulance, Firetruck): Moves even when the signal is "Red"
//Create an abstract class TrafficSignal with:
//
//Attribute: String state ("Red", "Yellow", "Green")
//Abstract method void changeSignal()
//Method void displaySignal() to print the current state
//Create a subclass SmartSignal that:
//
//Cycles through states in the order: "Green" → "Yellow" → "Red" → "Green"…
//Implements changeSignal()
//In the main method:
//
//Create a SmartSignal object.
//Create instances of Car, Bike, and EmergencyVehicle.
//Simulate a traffic system where:
//The signal state changes automatically.
//Each vehicle reacts based on the signal state.
//Print their movement status in each cycle.
abstract class TrafficSignal{
    public String[] state= new String[]{"Green", "Red", "Yellow"};
    abstract void changeSignal();
    public void displaySignal(int s){
        System.out.println("\nSignal is now: "+state[s]);
        Bike b= new Bike("Bike", 0);
        b.move(state[s]);
        Car c= new Car("Car", 0);
        c.move(state[s]);
        Ambulance a= new Ambulance("Ambulance", 80);
        a.move(state[s]);
    }
}
class SmartSignal extends TrafficSignal{

    @Override
    void changeSignal() {
        for (int i=0;i<state.length;i++){
            displaySignal(i);
        }
    }
}

abstract class Vehicle{
    protected String name;
    protected int speed;
    public Vehicle(String s, int a){
        name=s;
        speed =a;
    }
    abstract void move(String signalState);
    public void showDetails(){
        if (speed==0){
            System.out.println(name+" has stopped.");
        }else if (speed>=10 && speed<=30){
            System.out.println(name+" is slowing down to "+speed+" km/h.");
        }else{
            System.out.println(name+" is moving at speed "+speed+" km/h. ");
        }
    }
}
class Car extends Vehicle{

    public Car(String s, int a){
        super(s, a);
    }
    @Override
    void move(String signalState) {
        if (signalState.equalsIgnoreCase("red") || signalState.equalsIgnoreCase("yellow")){
            speed =0;
            showDetails();
        }else {
            speed=60;
            showDetails();
        }
    }
}
class Bike extends Vehicle{

    public Bike(String s, int a){
        super(s, a);
    }
    @Override
    void move(String signalState) {
        if (signalState.equalsIgnoreCase("red") ){
            speed =0;
            showDetails();
        }else if (signalState.equalsIgnoreCase("yellow")){
            speed=20;
            showDetails();
        }else{
            speed=40;
            showDetails();
        }
    }
}
class Ambulance extends Vehicle{

    public Ambulance(String s, int a){
        super(s, a);
    }
    @Override
    void move(String signalState) {
        speed=80;
        showDetails();
    }
}
public class SmartTrafficManagementSystem {
    public static void main(String[] args) {
        SmartSignal ss= new SmartSignal();
        ss.changeSignal();

    }
}

//Expected Output:
//Signal is now: Green
//Car is moving at speed 60 km/h
//Bike is moving at speed 40 km/h
//Ambulance is moving at speed 80 km/h
//
//Signal is now: Yellow
//Car has stopped.
//Bike is slowing down to 20 km/h.
//Ambulance is moving at speed 80 km/h.
//
//Signal is now: Red
//Car has stopped.
//Bike has stopped.
//Ambulance is moving at speed 80 km/h.