package Interfaces;

interface VehicleDashboard {
    void displaySpeed();

    default void displayBattery() {
        System.out.println("Battery status not available for this vehicle.");
    }
}

class ElectricCar implements VehicleDashboard {
    public void displaySpeed() { 
        System.out.println("Speed: 60 km/h"); 
    }
    public void displayBattery() { 
        System.out.println("Battery: 80%"); 
    }
}

class PetrolCar implements VehicleDashboard {
    public void displaySpeed() { 
        System.out.println("Speed: 70 km/h"); 
    }
}

public class DashboardDemo {
    public static void main(String[] args) {
        VehicleDashboard eCar = new ElectricCar();
        VehicleDashboard pCar = new PetrolCar();

        eCar.displaySpeed();
        eCar.displayBattery();

        pCar.displaySpeed();
        pCar.displayBattery();
    }
}

