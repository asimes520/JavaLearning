package pattern.factory;

/**
 * Created by lianglab on 2016/5/30.
 * 功能 ：
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
