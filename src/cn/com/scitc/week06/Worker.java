package cn.com.scitc.week06;

public class Worker {
    String ID;
    String name;
    String sex;
    String time;
    public  void show(){
        System.out.println(ID);
        System.out.println(name);
        System.out.println(sex);
        System.out.println(time);
    }
    public void add(int a,int b){
        int result = a + b;
        System.out.println(result);
    }
    public float add(float a,float b){
        return a + b;
    }
    public Worker(){

    }
    public Worker(String ID,String name,String sex,String time){
        this.ID=ID;
        this.name=name;
        this.sex=sex;
        this.time=time;
    }
}
