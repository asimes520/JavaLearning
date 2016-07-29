package pattern.decorator;

/**
 * Created by lianglab on 2016/5/27.
 * 功能 ：
 */
public class StaabuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + "  $"+beverage.cost());
        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Milk(beverage1);
        System.out.println(beverage1.getDescription() + "  $"+beverage1.cost());
    }
}
