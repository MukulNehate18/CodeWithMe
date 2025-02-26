package corejava.classandobject;
//Q1. WAP to create POJO class name as Player with id, name and run and input the data from keyboard and display it.

class Player{
    private int id;
    private String name;
    private int run;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRun() {
        return run;
    }
}
public class POJO1 {
    public static void main(String[] args) {
        Player p1= new Player();
        p1.setId(12);
        p1.setName("Mukul");
        p1.setRun(66);

        System.out.println("Name: "+p1.getName()+" Id: "+p1.getId()+" Run: "+p1.getRun());
    }
}
