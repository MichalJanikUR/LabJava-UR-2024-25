package ZadaniaLab6.Zad1;

public class Kwadrat extends Prostokat {
    public Kwadrat(double wys, double szer) {
        super(wys, szer);
    }

    public double getWys() {
        return wys;
    }

    public double getSzer() {
        return szer;
    }

    public void setWys(double wys) {
        this.wys = wys;
    }

    public void setSzer(double szer) {
        this.szer = szer;
    }

    @Override
    public String opis() {
        return super.opis()+", wysokość: "+wys+", szerokość: "+szer;
    }
}
