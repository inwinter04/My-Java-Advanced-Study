package cn.iamdt.file;

import java.io.File;

public class FileTest4 {
    /*
        需求：键盘录入一个文件夹路径，统计文件夹的大小
     */
    public static void main(String[] args) {

        File dir = FileTest1.getDir();

        long dirLength = getDirLength(dir);
        System.out.println(dirLength);

    }

    public static long getDirLength(File dir) {

        long sum = 0;

        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                sum += file.length();
            } else {
                if (file.listFiles() != null) {
                    sum += getDirLength(file);
                }
            }
        }

        return sum;

    }
}
