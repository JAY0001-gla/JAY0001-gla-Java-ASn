
abstract class VehicleRide {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public VehicleRide(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() { return vehicleId; }
    public void setVehicleId(String vehicleId) { this.vehicleId = vehicleId; }

    public String getDriverName() { return driverName; }
    public void setDriverName(String driverName) { this.driverName = driverName; }

    public double getRatePerKm() { return ratePerKm; }
    public void setRatePerKm(double ratePerKm) { this.ratePerKm = ratePerKm; }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId + " Driver: " + driverName + " Rate/km: " + ratePerKm);
    }
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

class CarRide extends VehicleRide implements GPS {
    private String location;

    public CarRide(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.location = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation() { return location; }

    @Override
    public void updateLocation(String newLocation) { this.location = newLocation; }
}

class BikeRide extends VehicleRide implements GPS {
    private String location;

    public BikeRide(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.location = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 0.6;
    }

    @Override public String getCurrentLocation() { return location; }
    @Override public void updateLocation(String newLocation) { this.location = newLocation; }
}

class AutoRide extends VehicleRide implements GPS {
    private String location;

    public AutoRide(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.location = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 0.8;
    }

    @Override public String getCurrentLocation() { return location; }
    @Override public void updateLocation(String newLocation) { this.location = newLocation; }
}

public class q8_RideHailingApplication {
    public static void main(String[] args) {
        VehicleRide[] rides = {
            new CarRide("V-CAR-1", "humanRaja", 15),
            new BikeRide("V-BIKE-2", "humanMina", 8),
            new AutoRide("V-AUTO-3", "humanKhan", 10)
        };

        double distance = 12.5; 
        for (VehicleRide v : rides) {
            v.getVehicleDetails();
            System.out.println("Fare for " + distance + " km: " + v.calculateFare(distance));
            if (v instanceof GPS) {
                GPS g = (GPS) v;
                g.updateLocation("Downtown");
                System.out.println("Location now: " + g.getCurrentLocation());
            }
            System.out.println("-----");
        }
    }
}
// das