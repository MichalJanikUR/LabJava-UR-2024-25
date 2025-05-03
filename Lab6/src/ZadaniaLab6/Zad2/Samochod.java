package ZadaniaLab6.Zad2;

public class Samochod {
    String marka, model, nadwozie, kolor;
    int rokProdukcji, przebieg;

    public Samochod(String marka, String model, String nadwozie, String kolor, int rokProdukcji, int przebieg) {
        this.marka = marka;
        this.model = model;
        this.nadwozie = nadwozie;
        this.kolor = kolor;
        this.rokProdukcji = rokProdukcji;

        if(przebieg < 0) this.przebieg = 0;
        else this.przebieg = przebieg;


    }

    public String Wyswietl()
    {
        return "Marka: "+marka+", Model: "+model+", Typ nadwozia: "+nadwozie+", Kolor: "+kolor+", Rok produkcji: "+rokProdukcji+", przebieg: "+przebieg+" km";
    }
}
