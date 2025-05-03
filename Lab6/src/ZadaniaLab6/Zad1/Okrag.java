package ZadaniaLab6.Zad1;

public class Okrag extends Figura {
    double promien;

    public double getPowierzchnia(){
        //pole pow. okregu - pi*r^2
        return Math.PI * promien * promien;
    }

    public double getSrednica(){
        return 2 * promien;
    }

    public Okrag() {
        this.punkt.zeruj();
        this.promien = 0;
    }

    public Okrag(String kolor, double promien) {
        super(kolor);
        this.promien = promien;
    }

    public Okrag(Punkt punkt, double promien) {
        super(punkt);
        this.promien = promien;
    }

    public void setPromien(double p) {
        this.promien = p;
    }

    public double getPromien() {
        return promien;
    }

    public boolean wSrodku(Punkt punkt,Punkt srodek)
    {
        if ((Math.pow((punkt.x - srodek.x),2) + Math.pow((punkt.y - srodek.y),2)) <= Math.pow(promien,2)) return true;
        else return false;
    }

    @Override
    public String opis() {
        return super.opis()+", promień okręgu: "+promien;
    }
}
