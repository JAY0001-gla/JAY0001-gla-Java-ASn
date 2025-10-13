package Interfaces;

class Prototype implements Cloneable {
    int version = 1;

    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }
}

public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype p1 = new Prototype();
        Prototype p2 = p1.clone();
        System.out.println("Cloned object version: " + p2.version);
    }
}

