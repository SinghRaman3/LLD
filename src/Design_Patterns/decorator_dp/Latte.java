package Design_Patterns.decorator_dp;

import java.awt.*;

public class Latte extends Decorator {
    public Latte(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return "Latte";
    }

    @Override
    public double getPrice() {
        return (super.getPrice() + 1.50);
    }
}
