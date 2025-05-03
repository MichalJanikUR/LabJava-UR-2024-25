package ZadaniaLab3;

import java.util.Scanner;

public class Lab3Zad4 {
    public static void sumaParzystych()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj ilość liczb w ciągu: ");
        int n = in.nextInt();

        int suma = 0;

        for(int i=1; i<=n; i++)
        {
            int liczba = (int) (-10 + Math.random() * 56);
            System.out.println("Wylosowana liczba z przedziału od -10 do 45: " + liczba);
            if (liczba % 2 == 0 || (-liczba) % 2 == 0)
            {
                suma += liczba;
            }
        }

        System.out.println("Suma liczb parzystych: " + suma);
    }

    public static void main(String[] args) {
        sumaParzystych();
    }
}
