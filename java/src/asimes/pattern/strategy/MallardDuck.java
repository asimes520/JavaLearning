package asimes.pattern.strategy;

import asimes.pattern.strategy.duckfly.FlyWithRocket;
import asimes.pattern.strategy.duckquack.Quack;

/**
 * Created by lianglab on 2016/5/25.
 * ���� ��
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
