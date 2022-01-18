package cn.com.scitc.week09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestInput {
    public static void main(String[] args) {
//        创建文件对象
        File f = new File("d:\\abc.txt");
//        输入流:文件字节输入流
        FileInputStream fis=null;
        try {
             fis=
                     new FileInputStream(f);
//            读取
            int n;
            byte[] b=new byte[100];
            while ((n = fis.read(b)) != -1){
                String s = new String(b,0,n);
                System.out.println(s);
//                System.out.print((char)n);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();

        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
