class ProductCatalog<T> { private T category; ProductCatalog(T category){this.category=category;} }
abstract class Product { abstract double getPrice(); }
class Marketplace {
    public static <T extends Product> void applyDiscount(T product,double percent){
        System.out.println("Applied discount of "+percent+"% on "+product.getClass().getSimpleName());
    }
    public static void main(String[] args){ applyDiscount(new Product(){double getPrice(){return 100;}},10); }
}