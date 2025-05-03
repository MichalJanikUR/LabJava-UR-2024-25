package ZadaniaLab8.Zad3;

public class Main {
    public static void main(String[] args) {
        Adres adresZamieszkania = new Adres("AAA","BBB","00-000",5);
        adresZamieszkania.Opis();

        adresZamieszkania.setUlica(null);
        adresZamieszkania.setMiasto(null);
        adresZamieszkania.setKodPocztowy(null);
        adresZamieszkania.setNumerDomu(-5);
    }
}
