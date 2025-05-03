package ZadaniaLab1;

import java.util.Scanner;

public class Lab1Zad7 {
    public static boolean czyDaSieZbudowacTrojkat(int l1, int l2, int l3)
    {
        if((l1 + l2 > l3) && (l1 + l3 > l2) && (l2 + l3 > l1)) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj początek przedziału losowania: ");
        int a = in.nextInt();

        System.out.println("Podaj koniec przedziału losowania: ");
        int b = in.nextInt();

        int l1 = (int)(a + Math.random() * (b-a+1));
        int l2 = (int)(a + Math.random() * (b-a+1));
        int l3 = (int)(a + Math.random() * (b-a+1));

        System.out.println("\nWylosowane liczby: " + l1 + "," + l2 + "," + l3);
        System.out.println(czyDaSieZbudowacTrojkat(l1,l2,l3));
    }
}
