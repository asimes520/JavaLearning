package pattern.strategy;

import pattern.strategy.duckfly.FlyNoWay;
import pattern.strategy.duckquack.MuteQuack;

/**
 * Created by lianglab on 2016/5/25.
 * ¹¦ÄÜ £º
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void disply() {
        System.out.println("I'm a ModelDuck, I can fly with rocket");
    }
}
