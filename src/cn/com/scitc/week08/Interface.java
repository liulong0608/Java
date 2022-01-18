package cn.com.scitc.week08;

public interface Interface {
//    接口本身具有数据成员，抽象方法，默认方法，静态方法
//    接口的数据成员都是静态且必须初始化,数据成员必须是静态常量
/*    语法格式
      [public] interface 接口名称 [extends 父接口名]

 */
//    静态常量
    final static String name="小头爸爸";           //final最终

//    抽象方法
    public abstract void driver();

//    静态方法
    public static void print(){
        System.out.println(name);
    }

//    默认方法
    public default void MOR(){
        System.out.println("这是"+name+"的默认方法");
    }
}
interface Mather{
//    静态常量
    public final static String name="围裙妈妈";

//    抽象方法
    public abstract void cook();

//    静态方法
    public static void show(){
        System.out.println(name);
    }

//    默认方法
    public default void showlnf(){
        System.out.println();
    }
}