import ZadaniaLab6.Zad1.*;

public class Zadania1 {
    public static void Run() {
        Punkt p1 = new Punkt();
        Punkt p2 = new Punkt(3, 4);
        Punkt p3 = new Punkt();

        System.out.println("Punkt 1 - konstruktor bezparametrowy: ");
        System.out.println(p1.opis());

        System.out.println("Punkt 2 - konstruktor parametrowy: ");
        System.out.println(p2.opis());

        System.out.println("Punkt 2 - po wyzerowaniu wartości: ");
        p2.zeruj();
        System.out.println(p2.opis());

        System.out.println("Punkt 3 - przed przesunięciem: ");
        System.out.println(p3.opis());

        System.out.println("Punkt 3 - po przesunięciu: ");
        p3.przesun(5, 7);
        System.out.println(p3.opis());

        Prostokat pr1 = new Prostokat(4,6);
        System.out.println(pr1.getPowierzchnia());

        Trojkat t1 = new Trojkat(3,5);

        Figura f1 = new Figura();
        Figura f2 = new Figura(p1);
        Figura f3 = new Figura("czerwony");

        System.out.println(f1.getKolor());
        System.out.println(f1.opis());

        System.out.println(f2.getKolor());
        System.out.println(f2.opis());

        System.out.println(f3.getKolor());
        System.out.println(f3.opis());

        Okrag o1 = new Okrag(p3,5);

        System.out.println("Okrąg 1\nPole powierzchni: "+o1.getPowierzchnia());
        System.out.println("Średnica: "+o1.getSrednica());

        o1.setPromien(7);
        System.out.println("Promień: "+o1.getPromien());

        Okrag o2 = new Okrag();

        System.out.println("Okrąg 2\nPole powierzchni: "+o2.getPowierzchnia());
        System.out.println("Średnica: "+o2.getSrednica());
        System.out.println("Promień: "+o2.getPromien());

        o2.setPromien(7);
        System.out.println("Promień po zmianie: "+o2.getPromien());

        pr1.przesun(3,5);
        System.out.println(pr1.getPowierzchnia());

        Kwadrat k1 = new Kwadrat(4,4);
        System.out.println(k1.getPowierzchnia());

    }
}
