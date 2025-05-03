package ZadaniaLab5.Zad2;

public class Student {
    private String imie;
    private String nazwisko;
    private int nr_indeksu;
    private String nazwa_specjalnosci;
    private int rok_studiow;

    public Student(String imie, String nazwisko, int nr_indeksu, String nazwa_specjalnosci, int rok_studiow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeksu = nr_indeksu;
        this.nazwa_specjalnosci = nazwa_specjalnosci;
        this.rok_studiow = rok_studiow;
    }

    public Student(String imie, String nazwisko, int nr_indeksu, String nazwa_specjalnosci) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeksu = nr_indeksu;
        this.nazwa_specjalnosci = nazwa_specjalnosci;
    }

    public Student(String imie, String nazwisko, int nr_indeksu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeksu = nr_indeksu;
    }

    public Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void pokazDane()
    {
        System.out.println("Imię: " + imie + ", nazwisko: " + nazwisko + ", nr indeksu: " + nr_indeksu + ", nazwa specjalności: " + nazwa_specjalnosci + ", rok studiów: " + rok_studiow);
    }
}
