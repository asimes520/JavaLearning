package asimes.pattern.decorator;

/**
 * Created by lianglab on 2016/5/27.
 * 功能 ：基类
 */
public abstract class Beverage {
    String description = "Unknow Beverage";

    public String getDescription(){
        return  description;
    }

    public abstract double cost();
}
