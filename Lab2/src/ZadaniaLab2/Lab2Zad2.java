package ZadaniaLab2;

import java.util.Scanner;

public class Lab2Zad2 {
    public static void obliczAX(double x)
    {
        if (x > 0) System.out.println(2 * x);
        else if (x == 0) System.out.println(0.0);
        else if (x < 0) System.out.println(-3 * x);
    }

    public static void obliczBX(double x)
    {
        if (x >= 1) System.out.println(x * x);
        else if (x < 1) System.out.println(x);
    }

    public static void obliczCX(double x)
    {
        if (x > 2) System.out.println(2 + x);
        else if (x == 2) System.out.println(8.0);
        else if (x < 2) System.out.println(x - 4);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj x: ");
        double x = in.nextDouble();

        obliczAX(x);
        obliczBX(x);
        obliczCX(x);
    }
}
