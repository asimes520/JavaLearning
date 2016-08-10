package asimes.pattern.factory;

/**
 * Created by lianglab on 2016/5/30.
 * 功能 ：
 */
public class NYStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else return null;
    }
}
