package ZadaniaLab7.Zad2;

public abstract class Figura {
    protected String name;
    public static final int a=3;
    public void Opis(){
        System.out.println("Figura o nazwie: " + name + "\nPole: " + Pole() + "\nObwód: " + Obwod());
    }
    public abstract double Pole();
    public abstract double Obwod();

    public void setName(String name) {
        this.name = name;
    }

    public Figura(String name) {
        this.name = name;
    }

    public abstract void Skaluj (float skala);
}
