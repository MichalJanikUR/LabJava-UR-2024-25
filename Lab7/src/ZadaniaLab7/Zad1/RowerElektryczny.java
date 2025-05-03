package ZadaniaLab7.Zad1;

public class RowerElektryczny extends Pojazd implements Elektryczny {
    private int poziomBaterii;

    public RowerElektryczny(String id, String model) {
        super(id, model);
    }

    public void naladuj() {
        poziomBaterii = 100;
    }

    public int poziomNaladowania(){
        return poziomBaterii;
    }

    @Override
    public double obliczKoszt(int liczbaGodzin) {
        return liczbaGodzin * 15.0;
    }
}
