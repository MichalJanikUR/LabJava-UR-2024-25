package ZadaniaLab10;

import java.util.*;

public class Zad3 {
    private static Map<String, Double> menu = new LinkedHashMap<>();
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flaga = true;

        while(flaga)
        {
            System.out.println("\n--- Wybierz jedną z opcji: ---");
            System.out.println("\n1. Dodaj nowe danie");
            System.out.println("\n2. Wyświetl kartę dań");
            System.out.println("\n3. Usuń danie");
            System.out.println("\n4. Oblicz rachunek za wybrane dania");
            System.out.println("\n5. Wyjdź z programu");

            String wybierz = in.nextLine();

            switch(wybierz) {
                case "1":
                    dodajDanie();
                    break;
                case "2":
                    wyswietlMenu();
                    break;
                case "3":
                    usunDanie();
                    break;
                case "4":
                    obliczRachunek();
                    break;
                case "5":
                    flaga = false;
                    break;
                default:
                    System.out.println("Nieprawidłowa opcja!");
                    break;
            }
        }
    }

    private static void dodajDanie(){
        System.out.println("Podaj nazwę dania: ");
        String danie = in.nextLine();

        System.out.println("Podaj cenę dania: ");
        try{
            double cena = Double.parseDouble(in.nextLine());
            menu.put(danie,cena);
            System.out.printf("Dodano: %s – %.2f zł%n", danie, cena);
        }
        catch (NumberFormatException e) {
            System.out.println("Nieprawidłowa cena - danie nie zostanie dodane.");
        }

    }

    private static void wyswietlMenu(){
        if(menu.isEmpty()){
            System.out.println("Brak dań w menu!");
        }
        System.out.println("Karta dań:");
        for(Map.Entry<String, Double> d : menu.entrySet())
        {
            System.out.printf("- %s: %.2f zł%n", d.getKey(), d.getValue());
        }
    }

    private static void usunDanie(){
        System.out.println("Podaj nazwę dania do usunięcia: ");
        String danie = in.nextLine();

        if(menu.remove(danie) != null) System.out.println("Usunięto: "+danie);
        else System.out.println("Nie ma takiego dania w menu!");
    }

    private static void obliczRachunek(){
        System.out.println("Podaj nazwy dań: ");
        String danie = in.nextLine();
        String[] dania = danie.split(",");

        double suma = 0;
        List<String> zamowione = new ArrayList<>();

        for(String nazwaDania: dania) {
            nazwaDania = nazwaDania.trim();
            Double cena = menu.get(nazwaDania);
            if(cena != null) {
                suma += cena;
                zamowione.add(nazwaDania);
            }
            else System.out.println("Nie znaleziono takiego dania!");
        }
        System.out.printf("Rachunek za "+zamowione+": "+suma+" zł", zamowione, suma);
    }


}
