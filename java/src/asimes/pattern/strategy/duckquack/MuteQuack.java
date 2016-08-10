package asimes.pattern.strategy.duckquack;

/**
 * Created by lianglab on 2016/5/25.
 * ���� ��
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("< < Silence > >");
    }
}
