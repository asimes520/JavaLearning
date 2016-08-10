package asimes.pattern.strategy;

import asimes.pattern.strategy.duckfly.FlyNoWay;
import asimes.pattern.strategy.duckquack.Squeak;

/**
 * Created by lianglab on 2016/5/25.
 * ���� ��
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
