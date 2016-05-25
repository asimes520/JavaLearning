package pattern.strategy.duckfly;

/**
 * Created by lianglab on 2016/5/25.
 * ¹¦ÄÜ £º
 */
public class FlyWithRocket implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with rockets");
    }
}
