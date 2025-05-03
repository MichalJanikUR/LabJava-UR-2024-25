import ZadaniaLab6.Zad2.Samochod;
import ZadaniaLab6.Zad2.SamochodOsobowy;

public class Zadania2 {
    public static void Run(){
        Samochod tesla = new Samochod("Tesla","T3000","SUV","czarny",2024,500000);
        System.out.println(tesla.Wyswietl());

        SamochodOsobowy toyota = new SamochodOsobowy("Toyota","Yaris","sedan","beżowy",2012,300000);
        System.out.println(toyota.Wyswietl());

        SamochodOsobowy toyota2 = new SamochodOsobowy("Toyota","Yaris","sedan","beżowy",2012,300000, 2.5, 2, 5);
        System.out.println(toyota2.Wyswietl());
    }
}
