package pattern.decorator;

/**
 * Created by lianglab on 2016/5/27.
 * 功能 ：低咖啡因
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "地擦飞鹰";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
