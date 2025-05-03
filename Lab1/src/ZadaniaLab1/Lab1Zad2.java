package ZadaniaLab1;

import java.util.Scanner;

public class Lab1Zad2 {
    public static void Oblicz(double a, double b)
    {
        System.out.println("Suma: " + (a+b) + ", różnica: " + (a-b) + ", iloczyn: " + a*b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj a: ");
        double a = in.nextDouble();

        System.out.println("Podaj b: ");
        double b = in.nextDouble();

        Oblicz(a,b);
    }
}
