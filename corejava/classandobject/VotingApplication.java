package corejava.classandobject;
//WAP Voting application using method with variable argos concept
//Voter: id name and age mark as POJO class
//VotingMachine: void acceptWord(Voter …v): accept the infinite voter if voter age is greater than 18 then display its data otherwise not
//VotingMachineApp: this method cantais voter details and pass to VotingMachine class

import java.util.Scanner;

class Voter{
    private int id, age;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }
}

class VotingMachine{
    public void acceptVote(Voter ...v){
        for (int i=0;i<v.length;i++){
            if (v[i].getAge()>=18){
                System.out.println(v[i].getName()+" is eligible for vote it's age is "+v[i].getAge());
            }else {
                System.out.println(v[i].getName()+" is not eligible for vote it's age is "+v[i].getAge());
            }
        }
    }
}
public class VotingApplication {
    public static void main(String[] args) {
        Voter v[]= new Voter[5];
        Scanner sc= new Scanner(System.in);
        for (int i=0;i<v.length;i++){
            v[i]=new Voter();
            System.out.print("Enter Name: ");
            v[i].setName(sc.next());
            System.out.print("Enter Id: ");
            v[i].setId(sc.nextInt());
            System.out.print("Enter Age: ");
            v[i].setAge(sc.nextInt());

        }
        VotingMachine vm =new VotingMachine();
        vm.acceptVote(v);
    }
}
