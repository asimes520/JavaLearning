package pattern.factory;

import java.util.ArrayList;

/**
 * Created by lianglab on 2016/5/30.
 * 功能 ：
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough " + dough);
        System.out.println("Adding sauce " + sauce);
        System.out.print("Adding toppings: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.print(" " + toppings.get(i));
        }
        System.out.println();
    }

    void bake(){
        System.out.println("It's Baking");
    }

    void cut(){
        System.out.println("It's cutting");
    }

    void box(){
        System.out.println("Put it into a box");
    }

    public String getName(){
        return  name;
    }



}