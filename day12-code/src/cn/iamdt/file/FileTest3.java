package cn.iamdt.file;

import java.io.File;

public class FileTest3 {
    /*
        需求：设计一个方法，删除文件夹 (delete() 只能删除空文件夹)
     */
    public static void main(String[] args) {
        deleteDir(new File("E:\\test2"));
    }

    public static void deleteDir(File dir) {

        File[] files = dir.listFiles();

        for (File file : files) {
            if (file.isFile()) {
                file.delete();
            } else {
                if (file.listFiles() != null) {
                    deleteDir(file);
                }
            }
        }

        dir.delete();

    }
}
