package asimes.clone;

/**
 * Created by lianglab on 2016/8/8.
 * 功能 ：
 */
public class Person {
    private String name;
    private int age;
    private String sex;

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Person(Person p){
        this.age = p.age;
        this.name = p.name;
        this.sex = p.sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public static void main(String[] args) {
        Person p1 = new Person("萌萌哒",4,"man");
        Person p2 = new Person(p1);
        p1.name = "棒棒哒";
        System.out.println(p1.name);
        System.out.println(p2.name);
    }
}
