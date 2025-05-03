package ZadaniaLab3;

import java.util.Scanner;

public class Lab3Zad3 {
    public static void sumaParzystych()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj ilość liczb w ciągu: ");
        int n = in.nextInt();

        int suma = 0;
        for(int i = 1; i <= n; i++)
        {
            System.out.println("Podaj " + i + " liczbę: ");
            int liczba = in.nextInt();
            if (liczba % 2 == 0)
            {
                suma += liczba;
            }
        }

        System.out.println("Suma liczb parzystych: " + suma);
    }

    public static void main(String[] args) {
        sumaParzystych();
    }
}
