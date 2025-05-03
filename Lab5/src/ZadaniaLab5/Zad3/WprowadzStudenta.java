package ZadaniaLab5.Zad3;

import ZadaniaLab5.Zad2.Student;

import java.util.Scanner;

public class WprowadzStudenta {
    public static void wprowadzanieStudenta()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        String imie = in.nextLine();

        System.out.println("Podaj nazwisko: ");
        String nazwisko = in.nextLine();

        System.out.println("Podaj nazwę specjalności: ");
        String nazwa_specjalnosci = in.nextLine();

        System.out.println("Podaj nr indeksu: ");
        int nr_indeksu = in.nextInt();

        System.out.println("Podaj rok studiów: ");
        int rok_studiow = in.nextInt();

        Student s5 = new Student(imie, nazwisko, nr_indeksu, nazwa_specjalnosci, rok_studiow);
        s5.pokazDane();
    }
}
