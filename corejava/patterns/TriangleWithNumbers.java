package corejava.patterns;

public class TriangleWithNumbers {
    public static void main(String[] args) {
        boolean flag = true;
        int num=1;
        for (int i=0;i<4;i++){
            for (int j=1; j<=7;j++){
                if (j>=(4-i)&& j<=(4-i)+2*i &&flag == true){
                    System.out.print(num);
                    num++;
                    flag= false;
                }else {
                    System.out.print(" ");
                    flag=true;
                }
            }
            System.out.println();
        }
    }
}
