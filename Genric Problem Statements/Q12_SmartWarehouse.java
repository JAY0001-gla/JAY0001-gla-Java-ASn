import java.util.*;
abstract class WarehouseItem {}
class Electronics extends WarehouseItem {}
class Groceries extends WarehouseItem {}
class Furniture extends WarehouseItem {}
class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();
    public void addItem(T i){items.add(i);} 
    public static void displayAll(List<? extends WarehouseItem> items){ items.forEach(i->System.out.println(i.getClass().getSimpleName())); }
    public static void main(String[] args){
        Storage<Electronics> e=new Storage<>();
        e.addItem(new Electronics());
        displayAll(Arrays.asList(new Electronics(),new Furniture()));
    }
}