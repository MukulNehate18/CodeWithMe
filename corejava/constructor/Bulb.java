package corejava.constructor;
//2. Create a LightBulb class
//Create a LightBulb class with a field state (boolean).
//Use the default constructor to set the bulb to off (false).
//Add methods turnOn() and turnOff() to toggle the state and display the current state.
//Explanation: Covers state management in an object and logic toggling.

class LightBulb{
    private Boolean state;
    public LightBulb(){
        state=false;
    }
    public void turnOn(){
        state=true;
        System.out.println("Bulb is on "+state);
    }
    public void turnOff(){
        state=false;
        System.out.println("Bulb is off "+state);
    }

}
public class Bulb {
    public static void main(String[] args) {
        LightBulb l= new LightBulb();
        l.turnOn();
        l.turnOff();
    }
}
