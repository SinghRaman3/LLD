package Design_Patterns.decorator_dp;

public abstract class Decorator implements Coffee{
    Coffee baseCoffee;

    Decorator(Coffee baseCoffee){
        this.baseCoffee = baseCoffee;
    }

    public String getDescription(){
        return baseCoffee.getDescription();
    }

    public double getPrice(){
        return baseCoffee.getPrice();
    }

}
