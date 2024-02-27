package cn.iamdt.output;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo1 {
    /*
        字节流写出数据

            构造方法：
                    1. public FileOutputStream(String name) : 输出流关联文件，文件路径以字符串形式给出
                    2. public FileOutputStream(File file) : 输出流关联文件，文件路径以File对象形式给出

            成员方法：
                    public void write(int i) : 写出一个字节
                    public void write(byte[] bys) : 写出一个字节数组

            细节：
                    输出流关联文件，文件如果不存在：会自动创建出来
                                  如果文件存在：会清空现有的内容然后再进行写入操作
     */
    public static void main(String[] args) throws IOException {

        // 创建字节流管道
        FileOutputStream fos = new FileOutputStream("E:\\Codes\\Java\\Advanced-Codes\\day13-code\\src\\cn\\iamdt\\FileTest\\A.txt");
        // FileOutputStream 通过重载方法传入true可将模式切换为追加，即不清空原有内容的情况下追加写出
        // FileOutputStream fos = new FileOutputStream("E:\\Codes\\Java\\Advanced-Codes\\day13-code\\src\\cn\\iamdt\\FileTest\\A.txt",true);

        // 创建字节数组
        byte[] bys = {97, 98, 99};

        // 写出一个字节
        fos.write(97);
        fos.write(98);
        fos.write(99);

        // 通过.getBytes()方法获取文本字节
        fos.write("你好Java！".getBytes());

        // 写出一个字节数组
        fos.write(bys);

        // 写出一个字节数组指定长度
        // off 开始索引 len 索引个数
        fos.write(bys,1,2);

    }
}
