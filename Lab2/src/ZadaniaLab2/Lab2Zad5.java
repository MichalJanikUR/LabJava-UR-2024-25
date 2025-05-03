package ZadaniaLab2;

import java.util.Scanner;

public class Lab2Zad5 {
    public static void wypiszWarunki(boolean znizkaNaSamochod, boolean premia)
    {
        if(!znizkaNaSamochod || premia) System.out.println("Możesz kupić samochód! Zniżki na samochód nie ma!");
        else if(!znizkaNaSamochod || !premia) System.out.println("Zakup samochodu trzeba odłożyć na póżniej... Zniżki na samochód nie ma!");
        else if(znizkaNaSamochod || premia) System.out.println("Możesz kupić samochód!");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj informację, czy jest zniżka na samochód (true/false): ");
        boolean znizkaNaSamochod = in.nextBoolean();
        System.out.println("Podaj informację, czy otrzymałeś premię (true/false): ");
        boolean premia = in.nextBoolean();

        wypiszWarunki(znizkaNaSamochod,premia);
    }
}
