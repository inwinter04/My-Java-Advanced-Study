package cn.iamdt.output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo2 {
    /*
        流对象使用完毕后需要关闭
     */
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("E:\\Codes\\Java\\Advanced-Codes\\day13-code\\src\\cn\\iamdt\\FileTest\\B.txt");

        fos.write("abc".getBytes());

        fos.close();

        while (true) {
        }
    }
}
