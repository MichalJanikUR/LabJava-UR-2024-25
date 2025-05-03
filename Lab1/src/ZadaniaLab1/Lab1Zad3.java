package ZadaniaLab1;

public class Lab1Zad3 {

    public static boolean czyParzysta(int a)
    {
        if (a%2 == 0) return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(czyParzysta(7));
    }
}
