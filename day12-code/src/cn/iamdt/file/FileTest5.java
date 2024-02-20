package cn.iamdt.file;

import java.io.File;
import java.util.HashMap;

public class FileTest5 {
    /*
        需求：键盘录入一个文件夹路径，统计文件夹中每种文件的个数并打印(考虑子文件夹)
            打印格式如下：
                txt:3个
                doc:4个
                jpg:6个
     */

    static HashMap<String, Integer> hm = new HashMap<>();
    static int count;

    public static void main(String[] args) {

        // 键盘接收一个文件夹路径
        File dir = FileTest1.getDir();

        getCount(dir);

        hm.forEach((type, count) -> System.out.println(type + ":" + count + "个"));
        System.out.println("无后缀名文件:" + count + "个");
    }

    public static void getCount(File dir) {

        // 获取文件对象
        File[] files = dir.listFiles();
        // 遍历文件对象
        for (File file : files) {
            // 判断文件对象是否为文件
            if (file.isFile()) {
                // 执行计数器代码
                // 判断文件是否有后缀
                if (!file.getName().contains(".")) {
                    count++;
                } else {
                    // 文件有后缀，对后缀进行切割操作
                    String[] split = file.getName().split("\\.");
                    String type = split[split.length - 1];
                    // 判断文件类型是否存在于HashMap中
                    if (hm.containsKey(type)) {
                        // 当文件类型存在时执行代码逻辑
                        hm.put(type, hm.get(type) + 1);
                    } else {
                        // 当文件类型不存在时执行代码逻辑
                        hm.put(type, 1);
                    }
                }
            } else {
                // 确保有权限调用listFiles方法
                if (file.listFiles() != null) {
                    // 递归调用代码，统计子文件夹
                    getCount(file);
                }
            }
        }
    }
}
