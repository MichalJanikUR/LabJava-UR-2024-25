package ZadaniaLab6.Zad3;

import java.util.List;
import java.util.ArrayList;

public class Klient extends Ksiegarnia{
    String imie, nazwisko;
    boolean czyStalyKlient;
    List<String> ksiazki = new ArrayList<>();

    public Klient(String nazwa, String adres, String godzOtw, String nrTel, String email, String strona, List<String> magazynKsiazek, String imie, String nazwisko, boolean czyStalyKlient, List<String> ksiazki) {
        super(nazwa, adres, godzOtw, nrTel, email, strona, magazynKsiazek);
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.czyStalyKlient = czyStalyKlient;
        this.ksiazki = ksiazki;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public boolean isCzyStalyKlient() {
        return czyStalyKlient;
    }

    public List<String> getKsiazki() {
        return ksiazki;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setCzyStalyKlient(boolean czyStalyKlient) {
        this.czyStalyKlient = czyStalyKlient;
    }

    public void setKsiazki(List<String> ksiazki) {
        this.ksiazki = ksiazki;
    }
}
