package ZadaniaLab10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj tekst: ");
        String text = input.nextLine();

        // ala Ma kota - ala ma kota
        // ALA MA KOTA

        text = text.toLowerCase().replaceAll("[.,!?;:]","");
        String[] words = text.split("\\s++");

        // , . ! ? ; :  Ala. -> ala

        Map<String, Integer> wordMap = new HashMap<>();

        for (String word: words){
            wordMap.put(word, wordMap.getOrDefault(word, 0)+1);
        }

        System.out.println("Lista wystąpień słów: \n");

        for (Map.Entry<String, Integer> entry : wordMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}