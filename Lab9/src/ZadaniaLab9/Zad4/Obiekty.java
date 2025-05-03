package ZadaniaLab9.Zad4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Obiekty {
    String nazwa;
    int ID;

    public Obiekty(String nazwa, int ID) {
        this.nazwa = nazwa;
        this.ID = ID;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "Obiekty{" +
                "nazwa='" + nazwa + '\'' +
                ", ID=" + ID +
                '}';
    }

    public static void main(String[] args) {
        Obiekty[] tablicaObiektow = {
            new Obiekty("Monitor",1),
            new Obiekty("Komputer",2),
            new Obiekty("Czajnik",3),
            new Obiekty("Grzejnik",4)
        };

        List<Obiekty> listaObiektow = new ArrayList<>(Arrays.asList(tablicaObiektow));
        System.out.println("Elementy listy:");

        for(Obiekty o: listaObiektow)
        {
            System.out.println(o);
        }

        List<Obiekty> subList = listaObiektow.subList(1,3);
        System.out.println("\nFragment do usunięcia:");
        for(Obiekty o: subList)
        {
            System.out.println(o);
        }

        subList.clear();

        System.out.println("\nLista po usunięciu danych:");
        for(Obiekty o: listaObiektow)
        {
            System.out.println(o);
        }
    }
}
