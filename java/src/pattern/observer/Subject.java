package pattern.observer;

/**
 * Created by lianglab on 2016/5/26.
 * ���� ��
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
