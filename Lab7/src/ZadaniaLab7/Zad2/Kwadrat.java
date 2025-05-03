package ZadaniaLab7.Zad2;

public class Kwadrat extends Figura implements IFigury {

    double a = 2;

    public void setA(double a) {
        this.a = a;
    }

    public Kwadrat(String name, double a) {
        super(name);
        this.a = a;
    }

    @Override
    public double Pole() {
        return a*a;
    }

    @Override
    public double Obwod() {
        return 4*a;
    }

    @Override
    public void Skaluj(float skala) {
            a *= skala;
    }

    @Override
    public double getPowierzchnia() {
        return a*a;
    }

    @Override
    public boolean wPolu(Punkt p) {
        if(p.x < a) return true;
        else return false;
    }
}
