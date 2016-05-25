package pattern.strategy;

import pattern.strategy.duckfly.FlyNoWay;
import pattern.strategy.duckquack.Squeak;

/**
 * Created by lianglab on 2016/5/25.
 * ¹¦ÄÜ £º
 */
public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void disply() {
        System.out.println("I'm a RubberDuck");
    }
}
