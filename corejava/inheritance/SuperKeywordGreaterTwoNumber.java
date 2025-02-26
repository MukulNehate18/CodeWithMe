package corejava.inheritance;

class Numbers{
    protected int x;
    public Numbers(int a){
        x=a;
    }
}
class Greater extends Numbers{
    private final int y;
    public Greater(int s, int b){
        super(s);
        y=b;
    }
    public void greater(){
        if (x<y){
            System.out.println(y+" is greater.");
        }else{
            System.out.println(x+" is greater.");
        }
    }
}
public class SuperKeywordGreaterTwoNumber {
    public static void main(String[] args) {
        Greater gm= new Greater(12, 56);
        gm.greater();
    }
}
