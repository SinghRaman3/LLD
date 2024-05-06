package Design_Patterns.decorator_dp;

public class Mocha extends Decorator {
    Mocha(Coffee coffee){
        super(coffee);
    }

    @Override
    public String getDescription() {
        return "Mocha";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1.00;
    }
}
