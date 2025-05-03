package ZadaniaLab2;

import java.util.Scanner;

public class Lab2Zad6 {
    public static void kalkulator()
    {
        System.out.println("1 - dodawanie liczb");
        System.out.println("2 - odejmowanie liczb");
        System.out.println("3 - iloczyn liczb");
        System.out.println("4 - iloraz liczb");
        System.out.println("5 - reszta z dzielenia liczb");
        System.out.println("6 - wyjście z programu\n");

        while(true) {

            Scanner in = new Scanner(System.in);
            System.out.println("Wybierz opcję:");
            int wybor = in.nextInt();

            System.out.println("Podaj a: ");
            double a = in.nextInt();

            System.out.println("Podaj b: ");
            double b = in.nextInt();

            switch (wybor) {
                case 1:
                    System.out.println("Suma: " + (a+b) + "\n");
                    break;
                case 2:
                    System.out.println("Różnica: " + (a-b) + "\n");
                    break;
                case 3:
                    System.out.println("Iloczyn: " + a*b + "\n");
                    break;
                case 4:
                    if(b!=0)
                    {
                        System.out.println("Iloraz: " + a/b + "\n");
                    }
                    else System.out.println("Nie można dzielić przez 0!");
                    break;
                case 5:
                    System.out.println("Reszta z dzielenia: " + a%b + "\n");
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Niepoprawna opcja!");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        kalkulator();
    }
}
