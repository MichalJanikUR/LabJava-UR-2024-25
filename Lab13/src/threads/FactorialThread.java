package threads;

public class FactorialThread extends Thread {
    private int n;
    private int silnia;

    public FactorialThread(int n) {
        this.n = n;
    }

    public void run()
    {
        if(n < 0) {
            System.out.println("Nie można obliczyć silni z liczby: "+n);
        }
        else{
            silnia = 1;
            for(int i = 1; i <= n ; i++)
            {
                silnia *= i;

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Wątek przerwany");
                }
            }

            System.out.println("Silnia liczby "+n+": "+silnia);
        }
    }
}
