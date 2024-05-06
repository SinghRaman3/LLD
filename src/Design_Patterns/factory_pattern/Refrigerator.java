package Design_Patterns.factory_pattern;

public class Refrigerator implements ElectronicItem {
    @Override
    public String itemName() {
        return "Refrigerator";
    }

    @Override
    public double itemPrice() {
        return 20000;
    }
}
