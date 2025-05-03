package ZadaniaLab3;

import java.util.Scanner;

public class Lab3Zad5 {
    public static boolean czyJestPalindromem(String wyraz)
    {
        String nowyWyraz = wyraz.replaceAll("[^a-zA-Z0-9]]"," ").toLowerCase();

        int dlugosc = wyraz.length();
        for(int i = 0; i < dlugosc /2; i++)
        {
            if(nowyWyraz.charAt(i) != nowyWyraz.charAt(dlugosc - i - 1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj dowolne słowo: ");
        String wyraz = in.nextLine();

        System.out.println(czyJestPalindromem(wyraz));
    }
}
