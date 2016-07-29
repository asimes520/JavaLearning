package pattern.decorator;

/**
 * Created by lianglab on 2016/5/27.
 * 深烘焙
 */
public class DarkRoast extends Beverage{
    public DarkRoast() {
        description = "深烘焙";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
