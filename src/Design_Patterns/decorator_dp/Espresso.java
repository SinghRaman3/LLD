package Design_Patterns.decorator_dp;

public class Espresso implements Coffee{
    public String getDescription(){
        return "Espresso";
    }

    public double getPrice(){
        return 1.00;
    }
}
