package ZadaniaLab4;

import java.util.Scanner;

public class Lab4Zad1 {
    public static int[] losujLiczby(int n)
    {
        int[] liczby = new int[n];

        for(int i = 0; i < n; i++)
        {
            int a = 6;
            int b = 15;

            liczby[i] = (int)(a + Math.random() * (b-a+1));
        }

        System.out.println("Wylosowane elementy tablicy: ");

        for(int i = 0; i < n; i++)
        {
            System.out.println(liczby[i]);
        }

        return liczby;
    }

    public static void oblicz()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj ilość elementów tablicy: ");
        int n = in.nextInt();

        int liczby[] = losujLiczby(n);

        int sumaFor = 0;
        int sumaForEach = 0;

        for(int i=0; i<liczby.length; i++)
        {
            sumaFor += liczby[i];
        }

        for(int i: liczby){
            sumaForEach += i;
        }

        System.out.println("Suma for: " + sumaFor + ", suma for each: " + sumaForEach);
        System.out.println("Średnia for: " + sumaFor/(double)liczby.length + ", średnia for each: " + sumaForEach/(double)liczby.length);
    }

    public static void main(String[] args) {
        oblicz();
    }
}