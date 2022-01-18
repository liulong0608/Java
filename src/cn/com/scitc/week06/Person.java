package cn.com.scitc.week06;

public class Person {
//    成员变量
    protected String name;
    protected int age;



    //    输出基本信息
//    方法
    public void show(){
        System.out.println(name+"\t"+age);
    }
//    不带参数构造方法
    public Person() {

    }
//    带参数构造方法
    public Person(String name,int age){
        this.name=name;
        this.age= age;
    }
}

