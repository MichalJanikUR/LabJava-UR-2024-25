package ZadaniaLab6.Zad3;

import java.util.List;
import java.util.ArrayList;

public class Ksiegarnia {
    String nazwa, adres, godzOtw, nrTel, email, strona;
    List<String> magazynKsiazek = new ArrayList<>();

    public Ksiegarnia(String nazwa, String adres, String godzOtw, String nrTel, String email, String strona, List<String> magazynKsiazek) {
        this.nazwa = nazwa;
        this.adres = adres;
        this.godzOtw = godzOtw;
        this.nrTel = nrTel;
        this.email = email;
        this.strona = strona;
        this.magazynKsiazek = magazynKsiazek;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getAdres() {
        return adres;
    }

    public String getGodzOtw() {
        return godzOtw;
    }

    public String getNrTel() {
        return nrTel;
    }

    public String getEmail() {
        return email;
    }

    public String getStrona() {
        return strona;
    }

    public List<String> getMagazynKsiazek() {
        return magazynKsiazek;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public void setGodzOtw(String godzOtw) {
        this.godzOtw = godzOtw;
    }

    public void setNrTel(String nrTel) {
        this.nrTel = nrTel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStrona(String strona) {
        this.strona = strona;
    }

    public void setMagazynKsiazek(List<String> magazynKsiazek) {
        this.magazynKsiazek = magazynKsiazek;
    }
}
