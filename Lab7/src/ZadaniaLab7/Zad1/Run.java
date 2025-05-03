package ZadaniaLab7.Zad1;

public class Run {
    public static void wypisz()
    {
        Pojazd samochodElektryczny = new SamochodElektryczny("142","Corsa");
        samochodElektryczny.wypozycz();
        System.out.println(samochodElektryczny.isCzyDostepny());
        samochodElektryczny.zwroc();
        System.out.println(samochodElektryczny.isCzyDostepny());
        samochodElektryczny.obliczKoszt(3);

        System.out.println(samochodElektryczny.getId());
        System.out.println(samochodElektryczny.getModel());

        Pojazd samochodInny = new Samochod("136","Yaris");
        System.out.println(samochodInny.obliczKoszt(4));
    }
}
