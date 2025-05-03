package ZadaniaLab11;

public class Zad2 {
    enum PizzaSize {
        MALA(20, 18.99),
        SREDNIA(30, 25.99),
        DUZA(40, 32.99);

        private int srednica;
        private double cena;

        PizzaSize(int srednica, double cena) {
            this.srednica = srednica;
            this.cena = cena;
        }

        public double getCena() {
            return cena;
        }

        public int getSrednica() {
            return srednica;
        }
    }

    public static void main(String[] args) {
        System.out.println(PizzaSize.MALA.getSrednica());
        System.out.println(PizzaSize.MALA.getCena());
        System.out.println(PizzaSize.SREDNIA.getSrednica());
        System.out.println(PizzaSize.SREDNIA.getCena());
        System.out.println(PizzaSize.DUZA.getSrednica());
        System.out.println(PizzaSize.DUZA.getCena());
    }
}
