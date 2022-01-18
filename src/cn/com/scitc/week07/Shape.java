package cn.com.scitc.week07;

public abstract class  Shape {
    String name;
    public void showName(){
        System.out.println(name);
    }
    public abstract void getArea();     //计算面积
    public abstract void getLength();   //计算周长
}
