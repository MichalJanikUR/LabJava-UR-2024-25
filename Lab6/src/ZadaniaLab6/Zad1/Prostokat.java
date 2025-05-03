package ZadaniaLab6.Zad1;

public class Prostokat extends Figura {
	double wys = 0, szer = 0;
	
	public Prostokat(double wys,double szer){
		this.wys = wys;
		this.szer = szer;
	}

    public double getPowierzchnia() {
        return (szer * wys);
    }

	public Prostokat(double wys, double szer, String kolor) {
		super(kolor);
		this.wys = wys;
		this.szer = szer;
	}

	public void przesun(double x, double y)
	{
		this.wys += x;
		this.szer += y;
	}

	@Override
	public String opis() {
		return super.opis()+", wysokość: "+wys+", szerokość: "+szer;
	}
}