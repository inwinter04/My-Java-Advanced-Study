package cn.iamdt.test;

import java.util.TreeMap;
import java.util.function.BiConsumer;

public class MapTest1 {
    /*
        需求：字符串 ababc

                请统计字符串中每一个字符出现的次数，并按照以下格式输出

                输出格式：
                            a(2)b(2)c(1)
     */
    public static void main(String[] args) {

        String info = "ababc";

        // 1. 准备map集合，用于统计字符的次数
        TreeMap<Character, Integer> tm = new TreeMap<>();

        // 2. 拆分字符串为数组
        char[] charArray = info.toCharArray();

        // 3. 循环拿出每一个字符
        for (char c : charArray) {
            // 4. 判断字符是否存在于TreeMap
            if (!tm.containsKey(c)) {
                // 如果不存在则新建一个键值对
                tm.put(c, 1);
            } else {
                // 如果存在则执行+1操作
                tm.put(c, tm.get(c) + 1);
            }
        }

        // 5. 按照格式输出结果
        StringBuilder sb = new StringBuilder();
        tm.forEach((key, value) -> sb.append(key).append("(").append(value).append(")"));

        System.out.println(sb);

    }
}
