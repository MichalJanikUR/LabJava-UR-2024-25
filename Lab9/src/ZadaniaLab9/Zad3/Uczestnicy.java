package ZadaniaLab9.Zad3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Uczestnicy {
    int ID, wiek;
    String imie;

    public Uczestnicy(int ID, int wiek, String imie) {
        this.ID = ID;
        this.wiek = wiek;
        this.imie = imie;
    }

    public int getID() {
        return ID;
    }

    public int getWiek() {
        return wiek;
    }

    public String getImie() {
        return imie;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    @Override
    public String toString() {
        return "Uczestnicy{" +
                "ID=" + ID +
                ", wiek=" + wiek +
                ", imie='" + imie + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Uczestnicy that)) return false;
        return ID == that.ID && wiek == that.wiek && Objects.equals(imie, that.imie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, wiek, imie);
    }

    public static List<Uczestnicy> filtrujNiepelnoletnich(List<Uczestnicy> uczestnik) {
        return uczestnik.stream().filter(p -> p.getWiek() >= 18).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Uczestnicy> uczestnicySpotkaniaArray = new ArrayList<>();

        uczestnicySpotkaniaArray.add(new Uczestnicy(1,16, "Antoni"));
        uczestnicySpotkaniaArray.add(new Uczestnicy(2,19,"Maciej"));
        uczestnicySpotkaniaArray.add(new Uczestnicy(3,20,"Natalia"));

        for(Uczestnicy u: uczestnicySpotkaniaArray)
        {
            System.out.println(u);
        }

        List<Uczestnicy> uczestnicySpotkaniaLinked = new LinkedList<>();

        uczestnicySpotkaniaLinked.add(new Uczestnicy(4,24, "Wojciech"));
        uczestnicySpotkaniaLinked.add(new Uczestnicy(5,17,"Urszula"));
        uczestnicySpotkaniaLinked.add(new Uczestnicy(6,18,"Lidia"));

        for(Uczestnicy u: uczestnicySpotkaniaLinked)
        {
            System.out.println(u);
        }

        List<Uczestnicy> dorosli = filtrujNiepelnoletnich(uczestnicySpotkaniaLinked);
        System.out.println("\nPełnoletni (dorośli) uczestnicy:");
        for(Uczestnicy u: dorosli)
        {
            System.out.println(u);
        }
    }
}