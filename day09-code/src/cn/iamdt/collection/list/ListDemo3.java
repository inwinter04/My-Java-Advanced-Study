package cn.iamdt.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo3 {
    /*
        并发修改异常 : ConcurrentModificationException

            场景：使用[迭代器]遍历集合的过程中，调用了[集合对象]的修改，删除方法，就会出现此异常

            解决方案: 迭代器的遍历过程中，不允许使用集合对象的修改或删除，那就使用迭代器自己的添加或删除方法

                    删除方法 : 普通的迭代器有
                    添加方法 : 普通的迭代器没有，需要使用List集合特有的迭代器
     */
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("眼瞅着你不是真正的开心");
        list.add("温油");
        list.add("离开俺们这旮表面");
        list.add("伤心的人别扭秧歌");
        list.add("私奔到东北");

        ListIterator<String> it = list.listIterator();
        while (it.hasNext()) {
            String s = it.next();
            if (s.equals("温油")) {
                it.remove();
                it.add("哈哈");
            }
        }

        System.out.println(list);

    }
}
