package ZadaniaLab11;

public class Zad1 {
    enum Swiatlo {
        CZERWONE("Stój!"),
        ZOLTE("Uwaga!"),
        ZIELONE("Jedź!");

        private String opis;

        Swiatlo(String opis) {
            this.opis = opis;
        }

        public String getKomunikat() {
            return opis;
        }
    }

    public static void main(String[] args) {
        Swiatlo sw[] = {
                Swiatlo.CZERWONE,
                Swiatlo.ZOLTE,
                Swiatlo.ZIELONE
        };

        for(Swiatlo s: sw)
            System.out.println("Stan:"+s+", opis: "+s.getKomunikat());
    }
}
