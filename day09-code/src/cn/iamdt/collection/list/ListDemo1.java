package cn.iamdt.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    /*
        List接口的特点 : 存取有序，有索引，可以存储重复的

        和索引有关的API

            public void add(int index, E element) : 在指定的索引位置添加元素
            public E remove(int index) : 根据索引删除集合中的元素
            public E set(int index, E element) : 根据索引修改集合中的元素
            public E get(int index) : 返回指定索引处的元素
     */
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();

        // 存取有序，可以存储重复的元素
        list1.add("张三");
        list1.add("李四");
        list1.add("王五");
        list1.add("张三");

        System.out.println(list1);

        // 删除集合中指定索引位置的元素
        list1.remove(3);
        System.out.println(list1);

        // 在指定的索引位置添加元素
        list1.add(0, "赵六");
        System.out.println(list1);

        // 修改指定的索引位置的元素
        list1.set(0, "赵6");
        System.out.println(list1);

        // 返回指定索引处的元素
        String s = list1.get(1);
        System.out.println(s);

        System.out.println("----------------------------------------");

        // 数字数组的数字会被误认为是索引
        List<Integer> list2 = new ArrayList<>();
        // 此处存在自动装箱
        list2.add(111);
        list2.add(222);
        list2.add(333);

        System.out.println(list2);

        // list2.remove(222); 222 此时被识别成元素索引，发生【IndexOutOfBoundsException】错误，此时需要手动装箱
        list2.remove(Integer.valueOf(222));
        System.out.println(list2);
    }
}
