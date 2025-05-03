package ZadaniaLab4;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class Lab4Zad5 {
    public static void sortowanieTab()
    {
        Scanner in = new Scanner(System.in);
        int[] liczby = new int[8];

        for(int i = 0; i < liczby.length; i++)
        {
            System.out.println("Podaj " + (i+1) + " liczbę: ");
            liczby[i] = in.nextInt();
        }

        for(int i = 0; i < liczby.length - 1; i++)
        {
            for(int j = 0; j < liczby.length - 1; j++)
            {
                int swap;

                if(liczby[j] > liczby[j+1])
                {
                    swap = liczby[j];
                    liczby[j] = liczby[j+1];
                    liczby[j+1] = swap;
                }
            }
        }

        for(int i = 0; i < liczby.length; i++)
        {
            System.out.println(liczby[i]);
        }
    }

    public static void main(String[] args) {
        sortowanieTab();
    }
}
