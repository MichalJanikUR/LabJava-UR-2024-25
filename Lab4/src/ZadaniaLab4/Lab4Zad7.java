package ZadaniaLab4;

import java.util.Arrays;

public class Lab4Zad7 {
    public static void porownajTab()
    {
        String[] slowa1 = {"Ala","ma","duzego","kota"};
        String[] slowa2 = {"Ala","ma","duzego","kota"};

        boolean takieSame = Arrays.equals(slowa1, slowa2);

        if(takieSame) System.out.println("Tablice mają takie same wartości!");
        else System.out.println("Tablice mają różne wartości!");
    }


    public static void main(String[] args) {
        porownajTab();
    }
}
