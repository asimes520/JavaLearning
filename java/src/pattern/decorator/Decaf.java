package pattern.decorator;

/**
 * Created by lianglab on 2016/5/27.
 * ���� ���Ϳ�����
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "�ز���ӥ";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
