package ZadaniaLab6.Zad1;

public class Punkt {
    int x, y;

    //konstruktor bezparametrowy inicjujący wartości
    public Punkt() {
        this.x = 1;
        this.y = 1;
    }

    //konstruktor z parametrami
    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String opis(){
        return "x: " + x + ", y: " + y;
    }

    public void przesun(int a, int b)
    {
        this.x += a;
        this.y += b;
    }

    public void zeruj(){
        this.x = 0;
        this.y = 0;
    }
}
