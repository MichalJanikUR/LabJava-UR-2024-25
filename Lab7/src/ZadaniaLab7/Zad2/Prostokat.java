package ZadaniaLab7.Zad2;

public class Prostokat extends Figura implements IFigury {

    double a=2;
    double b=3;

    public Prostokat(String prostokat, double a, double b) {
        super(prostokat);
        this.a = a;
        this.b = b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double Pole() {
        return a*b;
    }

    @Override
    public double Obwod() {
        return 2*(a+b);
    }

    @Override
    public void Skaluj(float skala) {
        a *= skala;
        b *= skala;
    }

    @Override
    public double getPowierzchnia() {
        return a*b;
    }

    @Override
    public boolean wPolu(Punkt p) {
        if(p.x < a && p.y < b) return true;
        else return false;
    }
}
