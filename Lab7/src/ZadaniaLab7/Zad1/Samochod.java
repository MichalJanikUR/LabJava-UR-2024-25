package ZadaniaLab7.Zad1;

public class Samochod extends Pojazd {
    public Samochod(String id, String model) {
        super(id, model);
    }

    @Override
    public double obliczKoszt(int liczbaGodzin) {
        return liczbaGodzin * 30.0;
    }
}
