package asimes.pattern.factory;

/**
 * Created by lianglab on 2016/5/30.
 * 功能 ：
 */
public class TestPizzaStore {
    public static void main(String[] args) {
        PizzaStore NYStore = new NYStylePizzaStore();
        PizzaStore ChicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = NYStore.orderPizza("cheese");
        System.out.println(pizza.getName());
        pizza = ChicagoStore.orderPizza("cheese");
        System.out.println(pizza.getName());
    }
}
