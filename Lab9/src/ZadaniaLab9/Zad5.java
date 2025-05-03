package ZadaniaLab9;

import java.util.*;

public class Zad5 {
    public static void main(String[] args) {
        List<Integer> liczby = new ArrayList<>();

        liczby.add(4);
        liczby.add(6);
        liczby.add(5);
        liczby.add(2);
        liczby.add(9);

        List<Integer> liczbyKopia = new ArrayList<>();

        ListIterator<Integer> iterator = liczby.listIterator(liczby.size());

        while(iterator.hasPrevious()) {
            liczbyKopia.add(iterator.previous());
        }

        System.out.println("Lista przed odwróceniem: "+liczby);
        System.out.println("Lista po odwróceniu: "+liczbyKopia);
    }
}
