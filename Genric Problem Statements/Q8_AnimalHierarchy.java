import java.util.*;
class Animal { public String toString(){return getClass().getSimpleName();}}
class Dog extends Animal {}
class Cat extends Animal {}
class AnimalHierarchy {
    public static void printAnimals(List<? extends Animal> animals){ animals.forEach(System.out::println); }
    public static void main(String[] args){
        List<Dog> dogs = Arrays.asList(new Dog(), new Dog());
        printAnimals(dogs);
    }
}