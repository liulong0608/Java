package cn.com.scitc.week06;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.name = "子铭";
        p1.age = 21;

        p1.show();

        Person p2 = new Person("顾笙",22);
        p2.show();
    }
}
