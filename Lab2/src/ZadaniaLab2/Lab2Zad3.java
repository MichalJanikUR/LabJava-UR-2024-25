package ZadaniaLab2;

import java.util.Scanner;

public class Lab2Zad3 {
    public static void uporzadkujLiczby(double x, double y, double z)
    {
        double swap;

        if (x > y)
        {
            swap = x;
            x = y;
            y = swap;
        }

        if (x > z)
        {
            swap = x;
            x = z;
            z = swap;
        }

        if (y > z)
        {
            swap = y;
            y = z;
            z = swap;
        }

        System.out.println("x: " + x + ", y: " + y + ", z:" + z);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj x: ");
        double x = in.nextDouble();

        System.out.println("Podaj y: ");
        double y = in.nextDouble();

        System.out.println("Podaj z: ");
        double z = in.nextDouble();

        uporzadkujLiczby(x,y,z);
    }
}
