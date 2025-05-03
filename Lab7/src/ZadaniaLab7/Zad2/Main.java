package ZadaniaLab7.Zad2;

public class Main
{
    public static void main(String[] args) {
        Figura figura = new Kwadrat("Kwadrat",4);

        figura.Obwod();
        figura.Pole();
        figura.Opis();

        Figura figura1 = new Prostokat("Prostokat",3,5);
        figura1.Opis();

        FiguraGeometryczna figuraGeometryczna = new Figura2D();
        System.out.println(figuraGeometryczna.Obwod());
        System.out.println(figuraGeometryczna.Pole());

        Figura[] f = {
                new Kwadrat("a",1),
                new Kwadrat("b",2),
                new Kwadrat("c",3),
                new Kwadrat("d",4),
                new Kwadrat("e",5),
                new Prostokat("f",1,5),
                new Prostokat("g",2,4),
                new Prostokat("h",3,6),
                new Prostokat("i",2,5),
                new Prostokat("j",1,6)
        };

        for(Figura f1 : f)
        {
            f1.Skaluj(3);
            f1.Opis();
        }

        IFigury[] fig = {
                new Kwadrat("asd",7),
                new Prostokat("asdd",3,4),
                new Trojkat("asddd",4,7)
        };

        for(IFigury f2 : fig)
        {
            System.out.println(f2.getPowierzchnia());
            System.out.println(f2.wPolu(new Punkt(7,4)));
        }
    }
}
