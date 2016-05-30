package pattern.decorator;

/**
 * Created by lianglab on 2016/5/27.
 * 功能 ：深烘焙的,适合喜欢浓厚口味的,味道会比较苦,
 */
public class DarkRoast extends Beverage{
    public DarkRoast() {
        description = "123";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
