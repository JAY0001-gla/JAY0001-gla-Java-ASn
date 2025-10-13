package Interfaces;

interface SmartDevice {
    void turnOn();
    void turnOff();
}
class Light implements SmartDevice {
    public void turnOn() { 
        System.out.println("Light ON"); 
    }
    public void turnOff() { 
        System.out.println("Light OFF"); 
    }
}
class AC implements SmartDevice {
    public void turnOn() { 
        System.out.println("AC ON"); 
    }
    public void turnOff() { 
        System.out.println("AC OFF"); 
    }
}

class TV implements SmartDevice {
    public void turnOn() { 
        System.out.println("TV ON"); 
    }
    public void turnOff() { 
        System.out.println("TV OFF"); 
    }
}

public class SmartDevices {
    public static void main(String[] args) {
        SmartDevice tv = new TV();
        tv.turnOn();
        tv.turnOff();
    }
}
