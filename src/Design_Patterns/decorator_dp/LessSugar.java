package Design_Patterns.decorator_dp;

import java.awt.*;

public class LessSugar extends Decorator {
    public LessSugar(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " with less sugar";
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }
}
