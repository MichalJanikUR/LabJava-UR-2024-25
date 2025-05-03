package ZadaniaLab7.Zad2;

public class Trojkat extends Figura implements IFigury {
	int wys = 0;
	int podst = 0;

	public Trojkat(String name, int wys, int podst) {
		super(name);
		this.wys = wys;
		this.podst = podst;
	}

	public String opis(){
		return "Trojkat o wymiarach: "+wys+"  "+podst;
	}

	@Override
	public double Pole() {
		return (wys*podst)/2;
	}

	@Override
	public double Obwod() {
		return 3*podst;
	}

	@Override
	public void Skaluj(float skala) {
		wys *= skala;
		podst *= skala;
	}

	@Override
	public double getPowierzchnia() {
		return (wys*podst)/2;
	}

	@Override
	public boolean wPolu(Punkt p) {
		if(p.x < wys && p.y < podst) return true;
		return false;
	}
}