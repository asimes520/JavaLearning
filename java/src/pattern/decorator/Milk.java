package pattern.decorator;

/**
 * Created by lianglab on 2016/5/27.
 * 功能 ：牛奶
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.3 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 阿斯顿发送到";
    }
}
