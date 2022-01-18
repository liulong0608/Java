package cn.com.scitc.week06;

public class Worker_2 {
    private String id;
    private String name;
    private String sex;
    private String birthday;
    private int money;

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setSex(String sex){
        this.sex=sex;
    }
    public String getSex(){
        return sex;
    }

    public void setBirthday(String birthday){
        this.birthday=birthday;
    }
    public String getBirthday(){
        return birthday;
    }

    public void setMoney(int money){
        this.money=money;
    }
    public int getMoney(){
        return money;
    }

    public void show(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(sex);
        System.out.println(birthday);
        System.out.println(money);
    }
    public void div(int a,int b){
        int result = a / b;
        System.out.println(result);
    }
    public float div(float a,float b){
        return a / b;
    }

    public Worker_2(){

    }
    public Worker_2(String id,String name,String sex,String birthday,int money){
        this.id=id;
        this.name=name;
        this.sex=sex;
        this.birthday=birthday;
        this.money=money;
    }
}
