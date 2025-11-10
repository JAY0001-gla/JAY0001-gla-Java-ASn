import java.util.*;
abstract class Product { abstract double getPrice(); }
class Mobile extends Product { double p; Mobile(double p){this.p=p;} double getPrice(){return p;} }
class Laptop extends Product { double p; Laptop(double p){this.p=p;} double getPrice(){return p;} }
class PriceCalculator {
    public static double calculateTotal(List<? extends Product> items){ double t=0; for(Product p:items)t+=p.getPrice(); return t; }
    public static void main(String[] args){
        List<Product> products=Arrays.asList(new Mobile(20000),new Laptop(50000));
        System.out.println("Total: "+calculateTotal(products));
    }
}