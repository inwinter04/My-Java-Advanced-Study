package cn.iamdt.output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo4 {
    /*
        IO流的异常处理方式：JDK7版本开始
     */
    public static void main(String[] args) throws Exception {

        // try() 括号中创建流对象，完成调用后可自动调用close方法
        try(FileOutputStream fos = new FileOutputStream("E:\\Codes\\Java\\Advanced-Codes\\day13-code\\src\\cn\\iamdt\\FileTest\\B.txt");){
            fos.write("abc".getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(Demo d = new Demo()){

        } catch (Exception e){

        }
    }
}

// 需要实现AutoCloseable接口后才可使用try()
class Demo implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("此重写方法会在try()结束后自动调用...");
    }
}
