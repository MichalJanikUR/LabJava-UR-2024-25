package ZadaniaLab5.Zad1;

public class Osoba {
    private String imie;
    private String nazwisko;
    private int wiek;

    //konstruktor ze wszystkimi parametrami
    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    //konstruktor z parametrami imie, wiek
    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    //konstruktor bezparametrowy
    public Osoba() {
    }

    public void pokazDane()
    {
        System.out.println("Imie: " + imie + ", nazwisko: " + nazwisko + ", wiek: " + wiek);
    }
}