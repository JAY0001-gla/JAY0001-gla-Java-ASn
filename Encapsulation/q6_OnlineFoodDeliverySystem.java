
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public void setItemName(String itemName) { this.itemName = itemName; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item: " + itemName + " Qty: " + quantity + " UnitPrice: " + price);
    }
}

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) { super(itemName, price, quantity); }

    @Override
    public double calculateTotalPrice() { return getPrice() * getQuantity(); }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05; 
    }

    @Override
    public String getDiscountDetails() { return "Veg 5% discount"; }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String itemName, double price, int quantity) { super(itemName, price, quantity); }

    @Override
    public double calculateTotalPrice() {
        double base = getPrice() * getQuantity();
        double nonVegCharge = 20 * getQuantity(); 
        return base + nonVegCharge;
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.03; 
    }

    @Override
    public String getDiscountDetails() { return "NonVeg 3% discount + non-veg charge"; }
}

public class q6_OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem v = new VegItem("humanSalad", 120, 2);
        FoodItem nv = new NonVegItem("humanChicken", 250, 1);

        FoodItem[] order = { v, nv };
        double grandTotal = 0;
        for (FoodItem f : order) {
            f.getItemDetails();
            double total = f.calculateTotalPrice();
            double discount = 0;
            String discInfo = "No disc";
            if (f instanceof Discountable) {
                Discountable d = (Discountable) f;
                discount = d.applyDiscount();
                discInfo = d.getDiscountDetails();
            }
            double net = total - discount;
            System.out.println("Total: " + total + " Discount: " + discount + " (" + discInfo + ") Net: " + net);
            System.out.println("-----");
            grandTotal += net;
        }
        System.out.println("Grand Total: " + grandTotal);
    }
}
