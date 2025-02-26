package corejava.classandobject;

import java.util.Scanner;

class MultiplicationTable{
    private int x;
    public void setValue(int a){
        x=a;
    }
    public void table(){
        System.out.println("Table of "+x+" is as follow: ");
        for(int i=1;i<=10;i++){
            System.out.println(x+" * "+i+" = "+(x*i));
        }
    }
}

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Table number: ");
        int s = sc.nextInt();

        MultiplicationTable mn = new MultiplicationTable();
        mn.setValue(s);
        mn.table();
    }
}
