package Diamond;

abstract class Prime implements Number{
    abstract void checkPrime(int n);

    @Override
    public void displayNumber(int n) {
        System.out.println(n);
    }
}
