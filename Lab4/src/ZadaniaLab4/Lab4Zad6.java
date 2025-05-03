package ZadaniaLab4;

import java.util.Scanner;

public class Lab4Zad6 {
    public static void obliczSilnie()
    {
        Scanner in = new Scanner(System.in);
        int[] liczby = new int[5];

        for(int i = 0; i < liczby.length; i++)
        {
            System.out.println("Podaj " + (i+1) + " liczbę: ");
            liczby[i] = in.nextInt();
        }

        for(int i = 0; i < liczby.length; i++)
        {
            int silnia = 1;

            for(int j = liczby[i]; j > 1; j--)
            {
                silnia *= j;
            }

            System.out.println(silnia);
        }
    }

    public static void main(String[] args) {
        obliczSilnie();
    }
}
