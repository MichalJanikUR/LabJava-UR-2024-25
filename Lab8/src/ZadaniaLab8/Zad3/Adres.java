package ZadaniaLab8.Zad3;

public class Adres {
    String ulica, miasto, kodPocztowy;
    int numerDomu;


    public Adres(String ulica, String miasto, String kodPocztowy, int numerDomu) {
        if(ulica == null) {throw new NieprawidlowyAdresException("Ulica nie może być nullem.");}
        else this.ulica = ulica;

        if(miasto == null) {throw new NieprawidlowyAdresException("Miasto nie może być nullem.");}
        else this.miasto = miasto;

        if(kodPocztowy == null) {throw new NieprawidlowyAdresException("Kod pocztowy nie może być nullem.");}
        else this.kodPocztowy = kodPocztowy;

        if(numerDomu <= 0) {throw new NieprawidlowyAdresException("Numer domu musi być dodatni.");}
        else this.numerDomu = numerDomu;
    }

    public void Opis(){
        System.out.println("Ulica: "+ulica+"\nMiasto: "+miasto+"\nKod pocztowy: "+kodPocztowy+"\nNr domu: "+numerDomu);
    }

    public String getUlica() {
        return ulica;
    }

    public String getMiasto() {
        return miasto;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public int getNumerDomu() {
        return numerDomu;
    }

    public void setUlica(String ulica) {
        if(ulica == null) {throw new NieprawidlowyAdresException("Ulica nie może być nullem.");}
        else this.ulica = ulica;
    }

    public void setMiasto(String miasto) {
        if(miasto == null) {throw new NieprawidlowyAdresException("Miasto nie może być nullem.");}
        else this.miasto = miasto;
    }

    public void setKodPocztowy(String kodPocztowy) {
        if(kodPocztowy == null) {throw new NieprawidlowyAdresException("Kod pocztowy nie może być nullem.");}
        else this.kodPocztowy = kodPocztowy;
    }

    public void setNumerDomu(int numerDomu) {
        if(numerDomu <= 0) {throw new NieprawidlowyAdresException("Numer domu musi być dodatni.");}
        else this.numerDomu = numerDomu;
    }
}
