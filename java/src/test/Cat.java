package test;

/**
 * Created by Liangweiwei on 2016/7/22.
 */
public class Cat {
    public static void main(String[] args)
    {
        Annimal a = new Annimal();
        Annimal d = new Dog();
        a.p();
        d.p();

    }
}


class Annimal {
    static void p() {
        System.out.println("wow");
    }
}

class Dog extends Annimal {
    static void p() {
        System.out.println("WOWOW");
    }
}