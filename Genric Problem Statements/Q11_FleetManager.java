import java.util.*;
abstract class Vehicle {}
class Truck extends Vehicle {}
class Bike extends Vehicle {}
class FleetManager<T extends Vehicle> {
    private List<T> fleet = new ArrayList<>();
    public void addVehicle(T v){ fleet.add(v);} 
    public void showFleet(){ fleet.forEach(f->System.out.println(f.getClass().getSimpleName())); }
    public static void main(String[] args){
        FleetManager<Truck> fm=new FleetManager<>();
        fm.addVehicle(new Truck());
        fm.showFleet();
    }
}