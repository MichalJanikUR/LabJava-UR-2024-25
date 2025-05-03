package ZadaniaLab1;

public class Lab1Zad1 {
    public static String Wypisz(String imie, int wiek)
    {
        return "Imię: " + imie + ", wiek: " + wiek;
    }

    public static void main(String[] args) {
        System.out.println(Wypisz("Anonim",35));
    }
}