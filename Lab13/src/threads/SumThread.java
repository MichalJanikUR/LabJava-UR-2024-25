package threads;

public class SumThread extends Thread {
    private int n;
    private int suma;

    public SumThread(int n) {
        this.n = n;
    }

    public void run()
    {
        suma = 0;

        for(int i = 1; i <= n; i++)
        {
            suma += i;

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Wątek przerwany");
            }
        }

        System.out.println("Suma od 1 do "+n+": "+suma);
    }
}
