
abstract class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public abstract double calculateDiscount();
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    private double warrantyYears;

    public Electronics(String productId, String name, double price, double warrantyYears) {
        super(productId, name, price);
        this.warrantyYears = warrantyYears;
    }

    @Override
    public double calculateDiscount() {

        return getPrice() * 0.10;
    }

    @Override
    public double calculateTax() {

        return getPrice() * 0.18;
    }

    @Override
    public String getTaxDetails() {
        return "GST 18% on Electronics";
    }
}

class Clothing extends Product implements Taxable {
    public Clothing(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {

        return getPrice() * 0.20;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05; 
    }

    @Override
    public String getTaxDetails() {
        return "VAT 5% on Clothing";
    }
}

class Groceries extends Product {
    public Groceries(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
     
        return getPrice() * 0.02;
    }
}

public class q2_ECommercePlatform {
    public static void printFinalPrice(Product p) {
        double price = p.getPrice();
        double discount = p.calculateDiscount();
        double tax = 0;
        String taxInfo = "No tax";
        if (p instanceof Taxable) {
            Taxable t = (Taxable) p;
            tax = t.calculateTax();
            taxInfo = t.getTaxDetails();
        }
        double finalPrice = price + tax - discount;
        System.out.println("Product: " + p.getName() + " (" + p.getProductId() + ")");
        System.out.println("Price: " + price + ", Tax: " + tax + " (" + taxInfo + "), Discount: " + discount);
        System.out.println("Final Price: " + finalPrice);
        System.out.println("----");
    }

    public static void main(String[] args) {
        Product e = new Electronics("E100", "humanPhone", 50000, 2);
        Product c = new Clothing("C200", "humanShirt", 1200);
        Product g = new Groceries("G300", "humanRice", 200);

        Product[] products = { e, c, g };
        for (Product p : products) printFinalPrice(p);
    }
}
