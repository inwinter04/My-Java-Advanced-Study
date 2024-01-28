package cn.iamdt.c;

import cn.iamdt.a.Student;

public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.eat();

        // 使用全类目创建对象 : 包名 + 类名
        cn.iamdt.b.Student stu2 = new cn.iamdt.b.Student();
        stu2.sleep();
    }
}
