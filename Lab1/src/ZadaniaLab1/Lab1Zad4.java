package ZadaniaLab1;

public class Lab1Zad4 {
    public static boolean czyPodzielnaPrzez3i5(int a)
    {
        if (a%3 == 0 && a%5 == 0) return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(czyPodzielnaPrzez3i5(89));
    }
}
