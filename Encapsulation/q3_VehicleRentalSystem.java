
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate; 

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public void setVehicleNumber(String vehicleNumber) { this.vehicleNumber = vehicleNumber; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public double getRentalRate() { return rentalRate; }
    public void setRentalRate(double rentalRate) { this.rentalRate = rentalRate; }

    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 500; 
    }

    @Override
    public String getInsuranceDetails() {
        return "Car insurance: flat 500";
    }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.6; 
    }

    @Override
    public double calculateInsurance() {
        return 150; 
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike insurance: flat 150";
    }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.5; 
    }

    @Override
    public double calculateInsurance() {
        return 1000;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck insurance: flat 1000";
    }
}

public class q3_VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("CAR-101", 2000),
            new Bike("BIKE-202", 800),
            new Truck("TRK-303", 5000)
        };

        for (Vehicle v : vehicles) {
            System.out.println("Vehicle: " + v.getVehicleNumber() + " Type: " + v.getType());
            System.out.println("Rental for 3 days: " + v.calculateRentalCost(3));
            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                System.out.println(ins.getInsuranceDetails() + ", Premium: " + ins.calculateInsurance());
            }
            System.out.println("-----");
        }
    }
}
