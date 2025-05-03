package ZadaniaLab3;

import java.util.Scanner;

public class Lab3Zad1 {
    public static void obliczSredniaPunktow()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj ilość studentów: ");
        int n = in.nextInt();

        double suma = 0;
        for (int i = 1; i <= n; i++)
        {
            System.out.println("Podaj ilość punktów dla " + i + " studenta: ");
            double pkt = in.nextDouble();
            suma += pkt;
        }

        System.out.println("Średnia ilość punktów w grupie: " + suma / (float)n);

        System.out.println("Ilosc studentow: " + n);
    }

    public static void main(String[] args) {
        obliczSredniaPunktow();
    }
}