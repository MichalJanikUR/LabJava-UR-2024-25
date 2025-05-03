package ZadaniaLab6.Zad2;

public class SamochodOsobowy extends Samochod{
    double waga, pojemnosc;
    int iloscOsob;

    public SamochodOsobowy(String marka, String model, String nadwozie, String kolor, int rokProdukcji, int przebieg) {
        super(marka, model, nadwozie, kolor, rokProdukcji, przebieg);
    }

    public SamochodOsobowy(String marka, String model, String nadwozie, String kolor, int rokProdukcji, int przebieg, double waga, double pojemnosc, int iloscOsob) {
        super(marka, model, nadwozie, kolor, rokProdukcji, przebieg);

        if(waga < 2) this.waga = 2;
        else if(waga > 4.5) this.waga = 4.5;
        else this.waga = waga;

        if(pojemnosc < 0.8) this.pojemnosc = 0.8;
        else if(pojemnosc > 3.0) this.pojemnosc = 3.0;
        else this.pojemnosc = pojemnosc;

        this.iloscOsob = iloscOsob;
    }

    @Override
    public String Wyswietl() {
        return super.Wyswietl()+", Waga: "+waga+" t, Pojemność silnika: "+pojemnosc+" l, Ilość osób: "+iloscOsob;
    }
}
