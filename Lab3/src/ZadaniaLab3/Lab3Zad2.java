package ZadaniaLab3;

import java.util.Scanner;

public class Lab3Zad2 {
    public static void oblicz()
    {
        double sumaDodatnich = 0;
        double sumaUjemnych = 0;
        int iloscDodatnich = 0;
        int iloscUjemnych = 0;

        Scanner in = new Scanner(System.in);

        for(int i = 1; i <= 10; i++)
        {
            System.out.println("Wczytaj " + i + " liczbę:");
            double liczba = in.nextDouble();
            if (liczba > 0)
            {
                iloscDodatnich++;
                sumaDodatnich += liczba;
            }
            else if (liczba < 0)
            {
                iloscUjemnych++;
                sumaUjemnych += liczba;
            }
        }

        System.out.println("Ilość liczb dodatnich: " + iloscDodatnich + ", suma tych liczb: " + sumaDodatnich);
        System.out.println("Ilość liczb ujemnych: " + iloscUjemnych + ", suma tych liczb: " + sumaUjemnych);
    }

    public static void main(String[] args) {
        oblicz();
    }
}
