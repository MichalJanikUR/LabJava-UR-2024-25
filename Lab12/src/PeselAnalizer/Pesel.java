package PeselAnalizer;

import java.time.LocalDate;

public class Pesel {
    private String pesel;
    private LocalDate dataUrodzenia;
    private boolean jakaPlec;

    public Pesel(String pesel) {
        this.pesel = pesel;
        this.dataUrodzenia = konwertujDate();
        this.jakaPlec = znajdzPlec();
    }

    private LocalDate konwertujDate() {
        int rok = Integer.parseInt(pesel.substring(0, 2));
        int miesiac = Integer.parseInt(pesel.substring(2, 4));
        int dzien = Integer.parseInt(pesel.substring(4,6));

        int wiek = 1900;

        if(miesiac >= 1 && miesiac <= 12){
            wiek = 1900;
        }
        else if(miesiac >= 21 && miesiac <= 32)
        {
            wiek = 2000;
            miesiac -= 20;
        }
        else if(miesiac >= 41 && miesiac <= 52)
        {
            wiek = 2000;
            miesiac -= 40;
        }
        else if(miesiac >= 61 && miesiac <= 72)
        {
            wiek = 2000;
            miesiac -= 60;
        }
        else if(miesiac >= 81 && miesiac <= 92)
        {
            wiek = 1800;
            miesiac -= 80;
        }

        return LocalDate.of(wiek + rok,miesiac,dzien);
    }

    private boolean znajdzPlec(){
        int plec = Character.getNumericValue(pesel.charAt(9));
        return plec % 2 == 0;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public boolean isJakaPlec() {
        return jakaPlec;
    }

    public String getPesel() {
        return pesel;
    }

    public String getSformatowanaData(){
        return dataUrodzenia.toString();
    }

    public int getWiek(){
        return LocalDate.now().getYear() - dataUrodzenia.getYear();
    }
}