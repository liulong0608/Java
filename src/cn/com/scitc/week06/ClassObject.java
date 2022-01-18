package cn.com.scitc.week06;

public class ClassObject {
//        java类的基本构成方法：属性、方法、构造方法
/*        【类的修饰符】class<类名>【extennd父类名】【implements接口名】
                {
                    成员变量；（属性）
                    构造方法：
                    成员方法；
                }

 */
//    成员变量
//    数据类型  变量名
    private byte age;
    private String name;
    private String color;
    //set get
    public void setAge(byte age){
        this.age=age;
    }
    public byte getAge(){
        return this.age;
    }

    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return this.color;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
//    成员方法
    public void eat(){
        System.out.println(name+"喜欢吃鱼");
    }
    public void print(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(color);
    }
}
