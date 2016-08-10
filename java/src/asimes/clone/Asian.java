package asimes.clone;

/**
 * Created by lianglab on 2016/8/8.
 * 功能 ：
 */
public class Asian {
    private String skin;
    Person person;

    public Asian(String skin,Person person){
        this.skin = skin;
        this.person = person;                    //引用赋值
    }

//    public Asian(Asian asian){                 //拷贝构造方法，复制对象
//        this(asian.skin,asian.person);
//    }

    public Asian(Asian asian){
        this.skin = asian.skin;
        this.person = new Person(asian.person);
    }

    public static void main(String[] args) {
        Person p1 = new Person("萌萌哒",4,"man");
        Asian a1 = new Asian("AA",p1);
        Asian a2 = new Asian(a1);
        a2.person.setName("棒棒哒");
        a1.skin = "BB";
        System.out.println(a1.person.getName());
        System.out.println(a2.person.getName());
        System.out.println(a1.skin);
        System.out.println(a2.skin);
    }
}