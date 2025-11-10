import java.util.*;
class Fruit {}
class Apple extends Fruit {}
class Mango extends Fruit {}
class FruitBox<T extends Fruit> {
    private List<T> fruits = new ArrayList<>();
    public void addFruit(T fruit) { fruits.add(fruit); }
    public void displayFruits() { fruits.forEach(f -> System.out.println(f.getClass().getSimpleName())); }
    public static void main(String[] args) {
        FruitBox<Apple> box = new FruitBox<>();
        box.addFruit(new Apple());
        box.addFruit(new Apple());
        box.displayFruits();
    }
}