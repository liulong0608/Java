package cn.com.scitc.week08;

public class Subinterface implements Interface,Mather{
//    成员变量
    String name;

//    成员方法
    public void showName(){
        System.out.println("他的名字:"+name);
    }
    @Override
    public void driver() {
        System.out.println("这是继承了"+Interface.name);     //接口调用
    }

    @Override
    public void cook() {
        System.out.println("这是继承了"+Mather.name);
    }
}
