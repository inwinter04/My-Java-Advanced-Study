package cn.iamdt.set;

import cn.iamdt.domain.Student;

import java.util.TreeSet;

public class TreeSetDemo2 {
    /*
        TreeSet集合存储Student学生对象
     */
    public static void main(String[] args) {

        TreeSet<Student> ts = new TreeSet<>();

        ts.add(new Student("王五", 25));
        ts.add(new Student("张三", 23));
        ts.add(new Student("李四", 24));
        ts.add(new Student("赵六", 26));
        ts.add(new Student("赵七", 26));
        ts.add(new Student("赵七", 26));

        System.out.println(ts);
    }
}
