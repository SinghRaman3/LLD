package Design_Patterns.decorator_dp;

public class Driver {
    public static void main(String[] args) {
        LessSugar coffee = new LessSugar(new ColdCoffee());

        System.out.println(coffee.getDescription());
        System.out.println(coffee.getPrice());
    }
}
