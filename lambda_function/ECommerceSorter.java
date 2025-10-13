import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    public Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    public String toString() {
        return name + " | ₹" + price + " | ⭐" + rating + " | " + discount + "% off";
    }
}

public class ECommerceSorter {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Shoes", 2999, 4.5, 20));
        products.add(new Product("Watch", 4999, 4.8, 10));
        products.add(new Product("Bag", 1999, 4.2, 30));
        products.add(new Product("Headphones", 1499, 4.6, 15));

        System.out.println("🔹 Sort by Price:");
        sortProducts(products, "price");

        System.out.println("\n🔹 Sort by Rating:");
        sortProducts(products, "rating");

        System.out.println("\n🔹 Sort by Discount:");
        sortProducts(products, "discount");
    }

    static void sortProducts(List<Product> products, String criteria) {
        Comparator<Product> comparator;

        switch (criteria) {
            case "price":
                comparator = (p1, p2) -> Double.compare(p1.price, p2.price);
                break;
            case "rating":
                comparator = (p1, p2) -> Double.compare(p2.rating, p1.rating);
                break;
            case "discount":
                comparator = (p1, p2) -> Double.compare(p2.discount, p1.discount);
                break;
            default:
                System.out.println("Unknown criteria: " + criteria);
                return;
        }

        products.sort(comparator);
        products.forEach(System.out::println);
    }
}