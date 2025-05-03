package PeselAnalizer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PeselAnalyzer {

    private List<Pesel> pesele = new ArrayList<>();

    public void odczytajPlik(String nazwa) throws IOException {
        try (Scanner in = new Scanner(new File(nazwa))){
            while(in.hasNextLine()){
                String linia = in.nextLine().trim();
                if(linia.matches("\\d{11}")){
                    pesele.add(new Pesel(linia));
                }
            }
        }
    }

    public void zapiszDaty(String nazwa) throws IOException {
        List<String> linie = new ArrayList<>();
        for (Pesel p: pesele){
            linie.add(p.getSformatowanaData());
        }
        Files.write(Paths.get(nazwa), linie);
    }

    public void wyswietlDane() {
        long kobiety = pesele.stream().filter(Pesel::isJakaPlec).count();
        long mezczyzni = pesele.size() - kobiety;

        System.out.println("Kobiety: " + kobiety);
        System.out.println("Mężczyźni: " + mezczyzni);

        int[] zakresy = {1950, 1980, 2000, 2025};
        for (int i = 0; i < zakresy.length - 1; i++)
        {
            int poczatek = zakresy[i];
            int koniec = zakresy[i+1];

            List<Pesel> grupa = getOsobyWPrzedziale(poczatek, koniec);
            double sredniaWieku = grupa.stream().mapToInt(Pesel::getWiek).average().orElse(0.0);
            System.out.println("Urodzeni "+poczatek+"-"+koniec+": "+grupa.size()+" osób, średni wiek: "+sredniaWieku);
        }
    }

    private List<Pesel> getOsobyWPrzedziale(int pocz, int kon)
    {
        List<Pesel> wynik = new ArrayList<>();
        for(Pesel p: pesele) {
            int rok = p.getDataUrodzenia().getYear();
            if(rok >= pocz && rok <= kon) {
                wynik.add(p);
            }
        }
        return wynik;
    }
}