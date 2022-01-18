package cn.com.scitc.week06;

public class test {
    public static void main(String[] args) {
        //    实例化对象
        ClassObject cat1 = new ClassObject();
        ClassObject cat2 = new ClassObject();
        ClassObject cat3 = new ClassObject();
//    格式：对象名.变量名（方法名）
        cat1.setName("小白");
        cat1.setColor("白色");
        cat1.setAge((byte)3);
        cat1.eat();
        cat1.print();

        cat2.setName("小花");
        cat2.setColor("花色");
        cat2.setAge((byte) 3);
        cat2.eat();
        cat2.print();

        cat3.setName("小黑");
        cat3.setColor("黑色");
        cat3.setAge((byte) 3);
        cat3.eat();
        cat3.print();
    }
}
