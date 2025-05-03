package ZadaniaLab6.Zad3;

import java.util.List;

public class Powiesc extends Ksiazka {
    String gatunek, grupaWiekowa, seria, nagrodyLiterackie;
    int nrTomuSerii;

    public Powiesc(String nazwa, String adres, String godzOtw, String nrTel, String email, String strona, List<String> magazynKsiazek, String gatunek, String grupaWiekowa, String seria, String nagrodyLiterackie, int nrTomuSerii) {
        super(nazwa, adres, godzOtw, nrTel, email, strona, magazynKsiazek);
        this.gatunek = gatunek;
        this.grupaWiekowa = grupaWiekowa;
        this.seria = seria;
        this.nagrodyLiterackie = nagrodyLiterackie;
        this.nrTomuSerii = nrTomuSerii;
    }

    public String getGatunek() {
        return gatunek;
    }

    public String getGrupaWiekowa() {
        return grupaWiekowa;
    }

    public String getSeria() {
        return seria;
    }

    public String getNagrodyLiterackie() {
        return nagrodyLiterackie;
    }

    public int getNrTomuSerii() {
        return nrTomuSerii;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public void setGrupaWiekowa(String grupaWiekowa) {
        this.grupaWiekowa = grupaWiekowa;
    }

    public void setSeria(String seria) {
        this.seria = seria;
    }

    public void setNagrodyLiterackie(String nagrodyLiterackie) {
        this.nagrodyLiterackie = nagrodyLiterackie;
    }

    public void setNrTomuSerii(int nrTomuSerii) {
        this.nrTomuSerii = nrTomuSerii;
    }
}
