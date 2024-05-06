package Design_Patterns.factory_pattern;

public class Driver {
    public static void main(String[] args) {
        ItemFactory factory = new ItemFactory();

        ElectronicItem item  = factory.searchItem("Television");
        System.out.println(item.itemName() + " is available at " + item.itemPrice());

        item = new Refrigerator();
        System.out.println(item.itemName() + " is available at " + item.itemPrice());
    }
}
