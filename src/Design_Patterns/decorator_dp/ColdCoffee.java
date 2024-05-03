package Design_Patterns.decorator_dp;

public class ColdCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "Cold Coffee";
    }

    @Override
    public double getPrice() {
        return 2.00;
    }
}
