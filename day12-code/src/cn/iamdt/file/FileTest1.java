package cn.iamdt.file;

import java.io.File;
import java.util.Scanner;

public class FileTest1 {
    /*
        需求：键盘录入一个文件夹路径，如果输入错误就给出提示，并继续录入，知道正确为止
     */
    public static void main(String[] args) {

        getDir();

    }

    public static File getDir() {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入文件夹路径：");

        while (true) {
            String path = sc.nextLine();
            File file = new File(path);

            if (file.isFile()) {
                System.out.println("您输入的是一个文件，请重新输入：");
            } else if (!file.exists()) {
                System.out.println("您输入的路径不存在，请重新输入：");
            } else {
                return file;
            }
        }

    }
}
