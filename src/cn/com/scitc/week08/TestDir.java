package cn.com.scitc.week08;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestDir {
    public static void main(String[] args) {
        System.out.println("请输入文件路径：");
        Scanner in = new Scanner(System.in);
        String path = in.next();
//        创建文件对象
        File f = new File(path);
        System.out.println(f.getPath()+"的目录");
//        获取文件夹，文件名字
        String[] fileName = f.list();

//        for (int i = 0;i < fileName.length;i++){
//            System.out.println(fileName[i]);
//        }
        for (String name : fileName){
//            文件对象（子文件）
            File kidFile = new File(f,name);
//            分支结构
            long time = kidFile.lastModified();
//            Date
            Date date = new Date(time);
//            日期格式化
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            String format = sdf.format(date);

            if (kidFile.isDirectory()){
                System.out.println("<Dir>\t"+name+"\t"+format);
            }else {
                System.out.println("\t"+name+"\t"+kidFile.length()/1024+"kb"+"\t"+format);
            }
        }
    }
}
