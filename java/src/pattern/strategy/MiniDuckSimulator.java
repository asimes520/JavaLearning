package pattern.strategy;

import pattern.strategy.duckfly.FlyWithRocket;

/**
 * Created by lianglab on 2016/5/25.
 * ¹¦ÄÜ £º
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck modelDuck = new ModelDuck();
        modelDuck.disply();
        modelDuck.swim();
        modelDuck.performaFly();
        modelDuck.performaQuack();
        modelDuck.setFlyBehavior(new FlyWithRocket());
        modelDuck.performaFly();
    }
}
