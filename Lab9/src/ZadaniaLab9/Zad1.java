package ZadaniaLab9;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Zad1 {
    public static void main(String[] args) {
        Set<String> imiona = new HashSet<>();

        Scanner in = new Scanner(System.in);

        String imie = "";

        while(true)
        {
            if(imie.equals("-")) break;

            System.out.println("Wprowadź imię: ");
            imie = in.nextLine();
            imiona.add(imie);
        }

        for(String item: imiona)
            System.out.println(item);
    }
}
