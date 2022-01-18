package cn.com.scitc.week07;

public class AbstractTest extends AbstractClass{
//    子类继承抽象父类必须继承父类的所有方法

//    定义成员变量
    int r;

    @Override
    public void getArea() {
        System.out.println("圆的面积是："+Math.PI*r*r);
    }

    @Override
    public double getLength() {
        return 2*Math.PI*r;
    }
}
class Test{
    public static void main(String[] args) {
        AbstractTest c1 = new AbstractTest();
        c1.name = "同心圆";
        c1.r = 5;
        c1.getArea();
        double length = c1.getLength();     //有返回类型
        System.out.println("圆的周长是："+length);
    }
}
