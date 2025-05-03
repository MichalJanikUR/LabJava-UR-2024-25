package ZadaniaLab2;

import java.util.Scanner;

public class Lab2Zad4 {
    public static void wypiszWarunki(boolean padaDeszcz, boolean autobusNaPrzystanku)
    {
        if(padaDeszcz && autobusNaPrzystanku) System.out.println("Weź parasol! Dostaniesz się na uczelnię!");
        else if(padaDeszcz && !autobusNaPrzystanku) System.out.println("Nie dostaniesz się na uczelnię!");
        else if(!padaDeszcz && autobusNaPrzystanku) System.out.println("Dostaniesz się na uczelnię! Miłego dnia i pięknej pogody!");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj informację, czy pada deszcz (true/false): ");
        boolean padaDeszcz = in.nextBoolean();
        System.out.println("Podaj informację, czy jest autobus na przystanku (true/false): ");
        boolean autobusNaPrzystanku = in.nextBoolean();

        wypiszWarunki(padaDeszcz,autobusNaPrzystanku);
    }
}
