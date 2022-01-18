package cn.com.scitc.week07;

import cn.com.scitc.week06.Person;

public class Worker extends Person {
    String id;
    String department;
    int money;

//    成员方法
    public void show(){
//        调用父类方法
//        super.show();
        System.out.println(id+"\t"+super.name+"\t"+super.age+"\t"+department+"\t"+money);
    }
    //不带参数构造方法
    public Worker(){

    }
//    带参数构造方法
//    public Worker(String name, int age, String id, String department, int money) {
//        super(name, age);
//        this.id = id;
//        this.department = department;
//        this.money = money;
//    }
    public Worker(String id,String name,int age,String department,int money){
        super(name,age);
        this.id = id;
//        super.name = name;
//        super.age = age;
        this.department = department;
        this.money = money;
    }

    public void getSum(int a){
        while (a != 0) {
            int sum = 0;
            int b = a % 10;
            sum = sum + b;
            a = a / 10;
        }
    }

}
