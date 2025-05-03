package ZadaniaLab7.Zad2;

public class Okrag extends Figura implements RuchFigury{
    double r;

    public Okrag(String name, double r) {
        super(name);
        this.r = r;
    }

    @Override
    public double Pole() {
        return Math.PI*r*r;
    }

    @Override
    public double Obwod() {
        return 2*Math.PI*r;
    }

    @Override
    public void Skaluj(float skala) {
        r *= skala;
    }

    @Override
    public void Przesun(int x) {
        r += x;
    }
}
