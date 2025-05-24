import VehicalFleetManagementSystem.Car;
import VehicalFleetManagementSystem.Engine;
import VehicalFleetManagementSystem.FuelTank;
import VehicalFleetManagementSystem.Truck;

public class Task {
    public static void Run(){
        Engine carEngine = new Engine(150,"Benzyna");
        FuelTank carFuelTank = new FuelTank(50);
        Car myCar = new Car("Toyota","Corolla",2020,180,carEngine,carFuelTank,5);

        Engine truckEngine = new Engine(150,"Benzyna");
        FuelTank truckFuelTank = new FuelTank(50);
        Truck myTruck = new Truck("Volvo","ABC123",2018,120,truckEngine,truckFuelTank,10);

        System.out.println(" ******** Informacje o samochodzie ******** ");
        myCar.displayInfo();

        carFuelTank.consume(10);
        carFuelTank.refuel(20);

        myCar.displayInfo();
    }
}
