package cn.iamdt.collection;

import cn.iamdt.domain.Student;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest1 {
    /*
        Collection的常用方法 :

            public boolean add(E e) : 把给定的对象添加到当前集合中
            public void clear() : 清空集合中所有的元素
            public boolean remove(E e) : 把给定的对象在当前集合中删除
            public boolean contains(Object obj) : 判断当前集合中是否包含给定的对象
            public boolean isEmpty() : 判断当前集合是否为空
            public int size : 返回集合中元素的个数(集合的长度)
     */
    public static void main(String[] args) {

        Collection<Student> c = new ArrayList<>();

        c.add(new Student("张三", 23));
        c.add(new Student("李四", 24));
        c.add(new Student("王五", 25));

        // 未重写equals方法时无法通过new对象进行删除
        c.remove(new Student("李四", 24));

        System.out.println(c);
    }

    private static void extracted() {
        // 以多态的形式创建集合对象，调用单列集合中的共有方法
        Collection<String> c = new ArrayList<>();

        // 添加元素
        c.add("张三");
        c.add("李四");
        c.add("王五");

        // 判断集合是否为空
        boolean b1 = c.isEmpty();
        System.out.println(b1);

        // 删除集合中的指定元素
        boolean b3 = c.remove("张三");
        System.out.println("删除【张三】元素的结果为" + b3);

        boolean b4 = c.remove("赵四");
        System.out.println("删除【赵四】元素的结果为" + b4);

        // 查看元素个数
        System.out.println(c.size());

        // 判断当前集合中是否包含给定的对象
        boolean b5 = c.contains("赵四");
        System.out.println("查询集合中是否包含【赵四】，结果为：" + b5);

        // 清空元素
        c.clear();

        // 判断集合是否为空
        boolean b2 = c.isEmpty();
        System.out.println(b2);
    }
}
