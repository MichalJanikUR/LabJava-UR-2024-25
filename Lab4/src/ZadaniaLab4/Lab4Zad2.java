package ZadaniaLab4;

public class Lab4Zad2 {
    public static void wypiszElementyTab()
    {
        int Liczby1[] = {1,6,32,8,4,13,72,26};
        int Liczby2[] = {4,2,1,26,21,14,7};

        System.out.println("Elementy o indeksach nieparzystych tablicy Liczby1: ");

        for(int i = 1; i < Liczby1.length; i+=2)
        {
            System.out.println(Liczby1[i]);
        }

        System.out.println("\nElementy o indeksach nieparzystych tablicy Liczby2: ");

        for(int i = 1; i < Liczby2.length; i+=2)
        {
            System.out.println(Liczby2[i]);
        }
    }

    public static void main(String[] args) {
        wypiszElementyTab();
    }
}
