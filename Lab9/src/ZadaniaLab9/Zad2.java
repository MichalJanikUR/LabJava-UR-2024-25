package ZadaniaLab9;

import java.util.*;

public class Zad2 {
    public static void main(String[] args) {
        List<String> imiona = new ArrayList<>();
        List<String> partnerzy = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        String imie = "";
        String partner = "";

        while(true)
        {
            System.out.println("Wprowadź imię: ");
            imie = in.nextLine();

            if(imie.equals("-")) break;

            System.out.println("Wprowadź imię partnera: ");
            partner = in.nextLine();

            if(partner.equals("-")) break;

            imiona.add(imie);
            partnerzy.add(partner);
        }

        System.out.println("Wprowadź dowolne imię:");
        imie = in.nextLine();

        boolean czyZnaleniony = false;

        for(int i = 0; i < imiona.size(); i++)
        {
            if (imiona.get(i).equals(imie))
            {
                System.out.println("Partner "+imie+" to:"+partnerzy.get(i));
                czyZnaleniony = true;
                break;
            }
            else if (partnerzy.get(i).equals(imie))
            {
                System.out.println("Partner "+imie+" to:"+imiona.get(i));
                czyZnaleniony = true;
                break;
            }
        }

        if(!czyZnaleniony) System.out.println("Nie znaleniono imienia "+imie+" na liście.");
    }
}
