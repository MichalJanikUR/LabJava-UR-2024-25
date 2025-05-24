package VehicalFleetManagementSystem;

public class FuelTank {
    private double capacity;
    private double currentLevel;

    public FuelTank(double capacity) {
        this.capacity = capacity;
    }

    public void refuel(double amount){
        if(currentLevel + amount > capacity){
            System.out.println("Nie można zatankować tyle paliwa. Maksymalna pojemność: " + capacity);
        }
        else{
            System.out.println("Zatankowano: " + amount);
            currentLevel += amount;
        }
    }

    public void consume(double amount){
        if(amount > currentLevel){
            System.out.println("Niewystarczająca ilość paliwa! Aktualny poziom: " + currentLevel);
        }
        else{
            currentLevel -= amount;
            System.out.println("Zużyto " + amount + " litrów paliwa. Pozostało: " + currentLevel);
        }
    }

    public void displayInfo(){
        System.out.println("Zbiornik paliwa: " + capacity + " [l]");
    }
}