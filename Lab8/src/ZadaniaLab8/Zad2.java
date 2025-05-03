package ZadaniaLab8;

public class Zad2 {

    public static int Silnia(int n) {
        int silnia = 0;

        try {
            if (n < 0) {
                throw new BlednaWartoscDlaSilniException("Nie można obliczyć silni z wartości ujemnej!");
            } else {
                silnia = 1;
                for (int i = 1; i <= n; i++) {
                    silnia *= i;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Błąd: podano niepoprawną liczbę");
        }

        return silnia;
    }

    public static void main(String[] args) {
        System.out.println(Silnia(4)); //120
    }
}
