package pattern.decorator;

/**
 * Created by lianglab on 2016/5/27.
 * 功能 ：混合咖啡
 */
public class HouseBlend extends Beverage{
    public HouseBlend() {
        description = "混合咖啡";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
