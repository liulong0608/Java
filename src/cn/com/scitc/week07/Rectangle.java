package cn.com.scitc.week07;

public class Rectangle extends Shape{
    int length = 25;
    int wide = 31;

    @Override
    public void getArea() {
        System.out.println("矩形的面积是："+length*wide);
    }

    @Override
    public void getLength() {
        System.out.println("矩形的周长是："+(length+wide)*2);
    }
}
class RectangleTest{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getArea();
        r1.getLength();
    }
}
