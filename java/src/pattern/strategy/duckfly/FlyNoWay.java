package pattern.strategy.duckfly;

/**
 * Created by lianglab on 2016/5/25.
 * ¹¦ÄÜ £º
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
