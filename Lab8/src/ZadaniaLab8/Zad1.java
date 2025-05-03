package ZadaniaLab8;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");

        try{
            String input = scanner.next();
            double liczba = Double.parseDouble(input);

            if(liczba < 0)
            {
                throw new IllegalArgumentException("Nie można obliczyć pierwiastka z liczby ujemnej!");
            }
            double pierwiastek = Math.sqrt(liczba);
            System.out.println("Pierwiastek z liczby " + liczba + " = " + pierwiastek);
        }
        catch (NumberFormatException e){
            System.out.println("Błąd: podano niepoprawną liczbę");
        }
        catch (IllegalArgumentException e){
            System.out.println("Błąd: " + e.getMessage());
        }
    }
}
