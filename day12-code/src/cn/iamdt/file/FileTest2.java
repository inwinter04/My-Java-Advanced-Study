package cn.iamdt.file;

import java.io.File;

public class FileTest2 {
    /*
        需求：键盘录入一个文件夹路径，找出这个文件夹下所有的 .java 文件
     */
    public static void main(String[] args) {

        File dir = FileTest1.getDir();

        printJavaFiles(dir);

    }

    public static void printJavaFiles(File dir) {

        for (File file : dir.listFiles()) {
            if (file.isFile()) {
                if (file.getName().endsWith(".java")) {
                    System.out.println(file);
                }
            } else {
                if (file.listFiles() != null)
                    printJavaFiles(file);
            }
        }
    }

    private static void method(File dir) {
        // 获取当前文件夹下所有的文件对象
        File[] files = dir.listFiles();

        // 遍历files
        for (File file : files) {
            if (file.isFile() && file.getName().endsWith(".java")) {
                System.out.println(file);
            }
        }
    }
}
