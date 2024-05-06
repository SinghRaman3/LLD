package Design_Patterns.decorator_dp;

public class Driver {
    public static void main(String[] args) {
        LessSugar coffee = new LessSugar(new ColdCoffee());
        System.out.println(coffee.getDescription() + " " + coffee.getPrice());

        Mocha mocha = new Mocha(new Latte(new Espresso()));
        System.out.println(mocha.getDescription() + " " + mocha.getPrice());
    }
}
