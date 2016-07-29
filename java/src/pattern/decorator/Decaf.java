package pattern.decorator;

/**
 * Created by lianglab on 2016/5/27.
 * 低咖啡因
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "低咖啡因";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
