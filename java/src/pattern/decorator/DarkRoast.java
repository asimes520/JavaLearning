package pattern.decorator;

/**
 * Created by lianglab on 2016/5/27.
 * ���� ����決��,�ʺ�ϲ��Ũ���ζ��,ζ����ȽϿ�,
 */
public class DarkRoast extends Beverage{
    public DarkRoast() {
        description = "123";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
