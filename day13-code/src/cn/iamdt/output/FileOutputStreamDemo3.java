package cn.iamdt.output;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo3 {
    /*
        IO流的异常处理方式：JDK7版本以前
     */
    public static void main(String[] args) {

        FileOutputStream fos = null;

        try{
            // System.out.println(10/0);   // ArithmeticException错误，导致后面代码均不能执行到
            fos = new FileOutputStream("E:\\Codes\\Java\\Advanced-Codes\\day13-code\\src\\cn\\iamdt\\FileTest\\B.txt");
            fos.write("abc".getBytes());
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
