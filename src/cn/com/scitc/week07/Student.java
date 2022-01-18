package cn.com.scitc.week07;

import cn.com.scitc.week06.Person;

public class Student extends Person {   //继承关系：子继父
//    类的三大特点：封装、继承、多态
//    成员变量
    String id;
    //String name;
    String classes;
    //int age;
//方法覆盖，方法重写
    //成员方法
    public void show(){
        System.out.println(id+"\t"+super.age+"\t"+super.name+"\t"+classes);
    }
    public Student(){

    }

    public Student(String id, String classes,String name,int age) {
        this.id = id;
        super.name=name;
        super.age=age;
        this.classes = classes;
    }

}
