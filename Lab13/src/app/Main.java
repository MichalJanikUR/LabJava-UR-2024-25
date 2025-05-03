package app;

import threads.FactorialThread;
import threads.SumThread;

public class Main {
    public static void main(String[] args) {
        SumThread suma = new SumThread(5);
        FactorialThread silnia = new FactorialThread(5);

        suma.start();
        silnia.start();

        try{
            suma.join();
            silnia.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}