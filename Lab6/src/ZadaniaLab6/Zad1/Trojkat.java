package ZadaniaLab6.Zad1;

public class Trojkat extends Figura {
	double wys = 0, podst = 0;

	public Trojkat(double wys, double podst)
	{
		this.wys = wys;
		this.podst = podst;
	}

	public Trojkat(double wys, double podst, String kolor) {
		super(kolor);
		this.wys = wys;
		this.podst = podst;
	}

	@Override
	public String opis() {
		return super.opis()+", wysokość: "+wys+", podstawa: "+podst;
	}
}