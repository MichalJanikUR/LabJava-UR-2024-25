package PeselAnalizer;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        PeselAnalyzer analyzer = new PeselAnalyzer();
        try {
            analyzer.odczytajPlik("pesele.txt");
            analyzer.zapiszDaty("wyniki.txt");
            analyzer.wyswietlDane();
        }
        catch(IOException e) {
            System.out.println("Błąd przy przetwarzaniu plików o treści: "+e.getMessage());
        }
    }
}