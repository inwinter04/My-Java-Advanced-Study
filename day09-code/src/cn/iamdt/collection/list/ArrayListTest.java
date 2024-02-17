package cn.iamdt.collection.list;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {

        // 创建ArrayList时，默认容量为0，直至添加第一个元素时容量扩容为10
        ArrayList<String> list = new ArrayList<>();

        list.add("张三");
    }
}
