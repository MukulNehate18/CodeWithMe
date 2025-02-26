package Diamond;

class Number1 extends Prime implements Even {
    int n;

    public void setN(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    @Override
    public void checkPrime(int n) {
        int count=0;
        for (int i=2;i<=n;i++){
            if (n%i==0){
                count++;
            }
        }
        if (count==1)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number.");
    }

    @Override
    public void checkEven(int n) {
        if (n%2==0)
            System.out.println(n+" is Even.");
        else
            System.out.println(n+" is Odd.");
    }
}
