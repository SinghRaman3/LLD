package Design_Patterns.factory_pattern;

public class Television implements ElectronicItem {
    @Override
    public String itemName() {
        return "Television";
    }

    @Override
    public double itemPrice() {
        return 25000;
    }
}
