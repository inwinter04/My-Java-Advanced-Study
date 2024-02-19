package cn.iamdt.tool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo {
    public static void main(String[] args) {

        // 给集合对象批量添加元素
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三", "李四", "王五");
        System.out.println(list);

        // 打乱List集合元素的顺序
        Collections.shuffle(list);
        System.out.println(list);

        // 以二分查找法查找元素
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "a", "b", "c", "d", "e");
        int result = Collections.binarySearch(list2, "d");
        System.out.println(result);

        // 根据默认的自然排序获取最大/最小值
        ArrayList<Integer> list3 = new ArrayList<>();
        Collections.addAll(list3, 2, 3, 4, 5, 61, 7);
        System.out.println(Collections.max(list3));
        System.out.println(Collections.min(list3));

        // 交换集合中指定位置的元素
        System.out.println(list3);
        Collections.swap(list3, 0, 2);
        System.out.println(list3);

        // sort : 对集合进行默认排序
        Collections.sort(list3);
        System.out.println(list3);

        // sort : 对集合进行自定义排序
        ArrayList<Integer> list4 = new ArrayList<>();
        Collections.addAll(list4, 9, 542, 782, 727, 15, 5, 8);
        Collections.sort(list4, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(list4);


    }
}
