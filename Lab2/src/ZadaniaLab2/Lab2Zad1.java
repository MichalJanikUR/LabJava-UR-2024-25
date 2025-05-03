package ZadaniaLab2;

import java.util.Scanner;

public class Lab2Zad1 {
    public static void obliczPierwiastki(double a, double b, double c)
    {
        double delta = b * b - 4 * a * c;

        if(delta > 0)
        {
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("Pierwiastki rzeczywiste: x1: " + x1 + ", x2: " + x2);
        }
        else if(delta == 0)
        {
            double x0 = -b / (2*a);
            System.out.println("Podwójny pierwiastek rzeczywisty x0: " + x0);
        }
        else System.out.println("Równanie nie ma pierwiastków rzeczywistych! Delta < 0!");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj a: ");
        double a = in.nextDouble();

        System.out.println("Podaj b: ");
        double b = in.nextDouble();

        System.out.println("Podaj c: ");
        double c = in.nextDouble();

        obliczPierwiastki(a,b,c);
    }
}