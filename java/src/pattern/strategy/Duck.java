package pattern.strategy;

import pattern.strategy.duckfly.FlyBehavior;
import pattern.strategy.duckquack.QuackBehavior;

/**
 * Created by lianglab on 2016/5/25.
 * ¹¦ÄÜ £º
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void disply();

    public void swim() {
        System.out.println("Swim");
    }

    public void performaFly() {
        flyBehavior.fly();
    }


    public void performaQuack() {
        quackBehavior.quack();
    }


    public void setFlyBehavior(FlyBehavior newFlyBehavior) {
        this.flyBehavior = newFlyBehavior;
    }

    public void setQuackBehavior(QuackBehavior newQuackBehavior) {
        this.quackBehavior = newQuackBehavior;
    }
}
