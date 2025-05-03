package ZadaniaLab5.Zad4;

import ZadaniaLab5.Zad2.Student;

public class ModyfikujStudenta {
    private Student[] studenci = new Student[100];

    // inicjalizowanie tablicy wartościami domyślnymi
    public void inicjalizuj()
    {
        for (int i = 0; i < studenci.length; i++)
        {
            studenci[i] = new Student("", "", 0, "", 0);
        }
    }

    // dodawanie danych studenta o wybranym indeksie
    public void dodajStudenta(int tab_index, String imie, String nazwisko, int nr_indeksu, String nazwa_specjalnosci, int rok_studiow)
    {
        if (czyPoprawnyIndeks(tab_index)) {
            studenci[tab_index] = new Student(imie, nazwisko, nr_indeksu, nazwa_specjalnosci, rok_studiow);
        }
        else System.out.println("Indeks jest nieprawidłowy!");
    }

    // modyfikowanie danych studenta o wybranym indeksie
    public void edytujStudenta(int tab_index, String imie, String nazwisko, int nr_indeksu, String nazwa_specjalnosci, int rok_studiow)
    {
        if (czyPoprawnyIndeks(tab_index)) {
            studenci[tab_index] = new Student(imie, nazwisko, nr_indeksu, nazwa_specjalnosci, rok_studiow);
        }
        else System.out.println("Indeks jest nieprawidłowy!");
    }

    // usuwanie danych studenta o wybranym indeksie
    public void usunStudenta(int tab_index)
    {
        if (czyPoprawnyIndeks(tab_index)) {
            studenci[tab_index] = new Student("", "", 0, "", 0);
        }
        else System.out.println("Indeks jest nieprawidłowy!");
    }

    // wyświetlanie danych studenta o wybranym indeksie
    public void wyswietlStudenta(int tab_index)
    {
        if (czyPoprawnyIndeks(tab_index)) {
            System.out.print("Student[" + tab_index + "]: ");
            studenci[tab_index].pokazDane();
        }
        else System.out.println("Indeks jest nieprawidłowy!");
    }

    public void wyswietlWszystkichStudentow()
    {
        for (int i = 0; i < studenci.length; i++)
        {
            System.out.print("Student[" + i + "]: ");
            studenci[i].pokazDane();
        }
    }

    // wyświetlanie danych studentów w podanym zakresie
    public void wyswietlZakresStudentow(int poczatek, int koniec)
    {
        if (czyPoprawnyIndeks(poczatek) && czyPoprawnyIndeks(koniec) && poczatek <= koniec)
        {
            for (int i = poczatek; i <= koniec; i++)
            {
                System.out.print("Student[" + i + "]: ");;
                studenci[i].pokazDane();
            }
        }
        else
        {
            System.out.println("Zakres jest niepoprawny!");
        }
    }

    // funkcja sprawdzająca, czy indeks jest prawidłowy
    private boolean czyPoprawnyIndeks(int tab_index)
    {
        return tab_index >= 0 && tab_index < studenci.length;
    }

}
