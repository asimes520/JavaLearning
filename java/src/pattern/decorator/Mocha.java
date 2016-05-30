package pattern.decorator;

/**
 * Created by lianglab on 2016/5/27.
 * ���� ������ Ħ��
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "�� ��˹�ٷ���";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
