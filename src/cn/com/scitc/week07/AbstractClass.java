package cn.com.scitc.week07;

public abstract class AbstractClass {
//    创建专门的类作为父类，叫做抽象类（模板）
//    abstract class 类名
//    定义成员变量
    String name;

//    成员方法
    public void print(){
        System.out.println(name);
    }

//    计算面积
    public abstract void getArea();

//    计算周长
    public abstract double getLength();
}
