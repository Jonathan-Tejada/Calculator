package ec.edu.epn.g12;

public class Calculator {

    private int ans;

    public int addition(int a, int b) {
        return a + b;
    }

    public int substraction(int a, int b) {
        return a - b;
    }

    public int division(int a, int b) {
        if (b == 0)
            throw new ArithmeticException();
        return a / b;
    }

    public int multiplication(int a, int b) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a * b;
    }

    public int exponentiation(int base, int exponente){
        int c=1;

        for (int i=0;i<exponente;i++){
            c=c*base;
        }
        return c;
    }

    public int getAns() {
        return ans;
    }

    public void setAns(int ans) {
        this.ans = ans;
    }
}