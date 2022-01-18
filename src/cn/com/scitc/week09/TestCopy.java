package cn.com.scitc.week09;

import java.io.*;
import java.util.Scanner;

public class TestCopy {
    public static void main(String[] args) {
//        知晓源文件的路径
        Scanner in=new Scanner(System.in);
        System.out.println("请输入源文件路径及名称：");
        String f1name = in.next();
        File f1 = new File(f1name);
//        目标路径
        System.out.println("请输入目标文件路径及名称：");
        String f2name = in.next();
        File f2 = new File(f2name);

//        读文件：文件字节输入流
        FileInputStream fis=null;

//        写文件：文件字节输出流
        FileOutputStream fos=null;

        try {
            fis = new FileInputStream(f1);
            fos = new FileOutputStream(f2);
//            定义数组
            byte[] b = new byte[500];
            int n;
            while ((n=fis.read(b)) != -1){
                fos.write(b,0,n);
            }

//            删除源文件
            f1.delete();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
