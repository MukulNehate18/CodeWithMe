package corejava.constructor;
import java.util.*;

class Cube{
    private int a;
    public Cube( int x){
        a=x;
    }
    public void cubeExample(){
        int n=1;
        for(int i =1; i<3; i++){
            n=n*a;
        }
        System.out.println("Cube is"+a);
    }
}

public class CubeExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int x= sc.nextInt();

        Cube c = new Cube(x);
        c.cubeExample();
    }
}
