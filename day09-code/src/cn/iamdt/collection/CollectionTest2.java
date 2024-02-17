package cn.iamdt.collection;

import cn.iamdt.domain.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest2 {
    /*
        public Iterator<E> iterator() : 获取遍历集合的迭代器
        public E next() : 从集合中获取一个元素

        注意：如果next()方法调用次数过多，会出现NoSuchElementException
     */
    public static void main(String[] args) {

        Collection<Student> c = new ArrayList<>();

        c.add(new Student("张三", 23));
        c.add(new Student("李四", 24));
        c.add(new Student("王五", 25));

        // 获取迭代器
        Iterator<Student> it = c.iterator();

        // 循环判断，集合中是否还有元素
        while (it.hasNext()) {
            // 调用next方法，将元素取出
            Student stu = it.next();
            System.out.println(stu);
        }

        System.out.println("-----------------------------");

        // 增强for循环遍历集合
        for (Student stu : c) {
            System.out.println(stu);
        }

        // foreach遍历集合
        c.forEach(stu -> System.out.println(stu));

    }
}
