package ZadaniaLab7.Zad1;

public abstract class Pojazd {
    protected boolean czyDostepny;
    protected String model;
    protected String id;

    public Pojazd(String id, String model){
        this.id = id;
        this.model = model;
    }

    public void wypozycz(){
        czyDostepny = false;
        System.out.println("Wypożyczono pojazd o id: " + id);
    };

    public void zwroc(){
        czyDostepny = true;
        System.out.println("Pojazd oddany!");
    };

    public boolean isCzyDostepny(){
        if(czyDostepny) System.out.println("Dostępny!");
        else System.out.println("Niedostępny!");
        return czyDostepny;
    };

    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public abstract double obliczKoszt(int liczbaGodzin);
}
