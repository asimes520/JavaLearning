package pattern.strategy;

import pattern.strategy.duckfly.FlyBehavior;
import pattern.strategy.duckfly.FlyWithRocket;
import pattern.strategy.duckquack.Quack;
import pattern.strategy.duckquack.QuackBehavior;

/**
 * Created by lianglab on 2016/5/25.
 * ¹¦ÄÜ £º
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithRocket();
        quackBehavior = new Quack();
    }

    public void disply() {
        System.out.println("I'm a MallarDuck");
    }
}
