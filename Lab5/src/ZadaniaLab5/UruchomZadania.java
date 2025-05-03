package ZadaniaLab5;

import ZadaniaLab5.Zad1.Osoba;
import ZadaniaLab5.Zad2.Student;
import ZadaniaLab5.Zad4.ModyfikujStudenta;

import static ZadaniaLab5.Zad3.WprowadzStudenta.wprowadzanieStudenta;

public class UruchomZadania {
    public static void Uruchom()
    {
        Osoba o1 = new Osoba();
        o1.pokazDane();

        Osoba o2 = new Osoba("Jan",26);
        o2.pokazDane();

        Osoba o3 = new Osoba("Adam","Nowak",34);
        o3.pokazDane();

        System.out.println("");

        Student s1 = new Student("Gall","Anonim");
        s1.pokazDane();

        Student s2 = new Student("Jacek","Kowalski", 137254);
        s2.pokazDane();

        Student s3 = new Student("Barbara","Zawrocka",163482,"Pedagogika");
        s3.pokazDane();

        Student s4 = new Student("Natalia","Mazur",148263,"Psychologia",3);
        s4.pokazDane();

        System.out.println("");

        wprowadzanieStudenta();

        System.out.println("");

        ModyfikujStudenta m1 = new ModyfikujStudenta();

        m1.inicjalizuj();

        m1.dodajStudenta(0, "Aleksander", "Wolski", 172393, "Zarządzanie", 4);
        m1.dodajStudenta(1, "Irena", "Wiśniewska", 181374, "Biotechnologia", 2);

        m1.wyswietlStudenta(0);
        System.out.println("");
        m1.wyswietlWszystkichStudentow();
        System.out.println("");
        m1.wyswietlZakresStudentow(45, 47);
        System.out.println("");

        m1.edytujStudenta(1, "Agnieszka", "Brudniak", 173286,"Inżynieria chemiczna",3);
        m1.wyswietlStudenta(1);
        System.out.println("");

        m1.usunStudenta(0);
        m1.wyswietlStudenta(0);
    }
}
