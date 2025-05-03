package ZadaniaLab4;

public class Lab4Zad3 {
    public static void zamienNaDuze()
    {
        String[] slowa = {"ala","ma","dużego","kota"};

        for(String i: slowa)
        {
            System.out.println(i.toUpperCase());
        }
    }

    public static void main(String[] args) {
        zamienNaDuze();
    }
}
