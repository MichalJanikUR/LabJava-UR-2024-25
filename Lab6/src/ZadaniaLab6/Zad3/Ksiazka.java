package ZadaniaLab6.Zad3;

import java.util.List;

public class Ksiazka extends Ksiegarnia{
    String tytul, autor, ISBN, wydawnictwo, kategoria;
    int rokWydania,iloscStron;
    double cena;

    public Ksiazka(String nazwa, String adres, String godzOtw, String nrTel, String email, String strona, List<String> magazynKsiazek) {
        super(nazwa, adres, godzOtw, nrTel, email, strona, magazynKsiazek);
    }

    public String getTytul() {
        return tytul;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getWydawnictwo() {
        return wydawnictwo;
    }

    public String getKategoria() {
        return kategoria;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public int getIloscStron() {
        return iloscStron;
    }

    public double getCena() {
        return cena;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setWydawnictwo(String wydawnictwo) {
        this.wydawnictwo = wydawnictwo;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }

    public void setIloscStron(int iloscStron) {
        this.iloscStron = iloscStron;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}
