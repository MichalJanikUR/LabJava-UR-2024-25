package ZadaniaLab4;

import java.util.Scanner;

public class Lab4Zad4 {
    public static void odwrocSlowa()
    {
        Scanner in = new Scanner(System.in);
        String[] slowa = new String[5];

        for(int i = 0; i < slowa.length; i++)
        {
            System.out.println("Podaj " + (i+1) + " słowo: ");
            slowa[i] = in.nextLine();
        }

        for(int i = slowa.length-1; i >= 0; i--)
        {
            String noweSlowo = "";

            for(int j = 0; j < slowa[i].length(); j++)
            {
                noweSlowo = slowa[i].charAt(j) + noweSlowo;
            }
            System.out.println(noweSlowo);
        }
    }

    public static void main(String[] args) {
        odwrocSlowa();
    }
}
