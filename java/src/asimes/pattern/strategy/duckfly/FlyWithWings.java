package asimes.pattern.strategy.duckfly;

/**
 * Created by lianglab on 2016/5/25.
 * ���� ��
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying with Wings");
    }
}
