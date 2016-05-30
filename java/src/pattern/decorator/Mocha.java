package pattern.decorator;

/**
 * Created by lianglab on 2016/5/27.
 * 功能 ：调料 摩卡
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "， 阿斯顿发文";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
