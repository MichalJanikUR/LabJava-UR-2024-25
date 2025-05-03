package ZadaniaLab10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zad2 {
    private static Map<String, String> uzytkownicy = new HashMap<>();
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flaga = true;

        while(flaga)
        {
            System.out.println("--- Wybierz jedną z opcji: ---");
            System.out.println("\n1. Dodaj nowego użytkownika");
            System.out.println("\n2. Zaloguj się");
            System.out.println("\n3. Wyjdź z programu");

            String wybierz = in.nextLine();

            switch(wybierz) {
                case "1":
                    dodajUzytkownika();
                    break;
                case "2":
                    zalogujSie();
                    break;
                case "3":
                    flaga = false;
                    break;
                default:
                    System.out.println("Nieprawidłowa opcja!");
                    break;
            }
        }
    }

    private static void dodajUzytkownika() {
        System.out.println("Podaj swój login:");
        String login = in.nextLine();

        if(uzytkownicy.containsKey(login)) {
            System.out.println("Taki użytkownik już istnieje!");
        }

        System.out.println("Podaj swoje hasło: ");
        String haslo = in.nextLine();

        uzytkownicy.put(login, haslo);
        System.out.println("Pomyślnie dodano nowego użytkownika!");
    }

    private static void zalogujSie()
    {
        System.out.println("Podaj swój login:");
        String login = in.nextLine();

        if(!uzytkownicy.containsKey(login)) {
            System.out.println("Taki użytkownik nie istnieje!");
        }
        else{
            System.out.println("Podaj swoje hasło: ");
            String haslo = in.nextLine();

            if(uzytkownicy.get(login).equals(haslo)) System.out.println("Zalogowano pomyślnie!");
            else System.out.println("Nieprawidłowe hasło!");
        }
    }

}
