package cn.iamdt.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {
    /*
        List集合的遍历方式 :

            1. 迭代器遍历
            2. 增强for循环
            3. foreach方法
            4. 普通for循环
            5. ListIterator (List集合特有的迭代器)
     */
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("bbb");
        list.add("ccc");
        list.add("abc");

        // 普通for循环遍历集合
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }

        System.out.println("------------------------------");

        // listIterator遍历集合
        ListIterator<String> it = list.listIterator();

        // 无法进行倒序遍历，指针指向0，前面无元素，故while内代码块不执行
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }

        System.out.println("------------------------------");

        // 正序遍历集合
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("------------------------------");

        // 倒序遍历集合
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}
