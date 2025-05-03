package ZadaniaLab6.Zad3;

import java.util.List;
import java.util.ArrayList;

public class Podrecznik extends Ksiazka{
    String przedmiot, rodzajSzkoly, nrDopuszczenia;
    boolean czyZatwierdzony;
    List<String> autorzy = new ArrayList<>();

    public Podrecznik(String nazwa, String adres, String godzOtw, String nrTel, String email, String strona, List<String> magazynKsiazek, String przedmiot, String rodzajSzkoly, String nrDopuszczenia, boolean czyZatwierdzony, List<String> autorzy) {
        super(nazwa, adres, godzOtw, nrTel, email, strona, magazynKsiazek);
        this.przedmiot = przedmiot;
        this.rodzajSzkoly = rodzajSzkoly;
        this.nrDopuszczenia = nrDopuszczenia;
        this.czyZatwierdzony = czyZatwierdzony;
        this.autorzy = autorzy;
    }

    public String getPrzedmiot() {
        return przedmiot;
    }

    public String getRodzajSzkoly() {
        return rodzajSzkoly;
    }

    public String getNrDopuszczenia() {
        return nrDopuszczenia;
    }

    public boolean isCzyZatwierdzony() {
        return czyZatwierdzony;
    }

    public List<String> getAutorzy() {
        return autorzy;
    }

    public void setPrzedmiot(String przedmiot) {
        this.przedmiot = przedmiot;
    }

    public void setRodzajSzkoly(String rodzajSzkoly) {
        this.rodzajSzkoly = rodzajSzkoly;
    }

    public void setNrDopuszczenia(String nrDopuszczenia) {
        this.nrDopuszczenia = nrDopuszczenia;
    }

    public void setCzyZatwierdzony(boolean czyZatwierdzony) {
        this.czyZatwierdzony = czyZatwierdzony;
    }

    public void setAutorzy(List<String> autorzy) {
        this.autorzy = autorzy;
    }
}
