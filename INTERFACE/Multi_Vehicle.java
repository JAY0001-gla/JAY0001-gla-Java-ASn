package Interfaces;

interface Vehicle {
    void rent();
    void returnVehicle();
}
class Car implements Vehicle {
    public void rent() { 
        System.out.println("Car rented"); 
    }
    public void returnVehicle() { 
        System.out.println("Car returned"); 
    }
}
class Bike implements Vehicle {
    public void rent() { 
        System.out.println("Bike rented"); 
    }
    public void returnVehicle() { 
        System.out.println("Bike returned"); 
    }
}

class Bus implements Vehicle {
    public void rent() { 
        System.out.println("Bus rented"); 
    }
    public void returnVehicle() { 
        System.out.println("Bus returned"); 
    }
}

public class Multi_Vehicle {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.rent();
        car.returnVehicle();
    }
}
