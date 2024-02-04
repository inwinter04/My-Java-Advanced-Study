package cn.iamdt.object.tostring;

import cn.iamdt.object.Student;

public class ToStringDemo {
    /*
        public String toString() 返回该对象的字符串表示

        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }

        getClass().getName() : 类名称，全类名(包名 + 类名)
        Integer.toHexString() : 转十六进制
        hashCode() : 返回的是对象内存值 ＋ 哈希算法，算出来的整数 (哈希值)

        ------------------------------------------------------------

        细节：使用打印语句，打印对象名的时候，println方法源码层面会自动调用该对象的toString方法。

        public static String valueOf(Object obj) {
            return (obj == null) ? "null" : obj.toString();
        }
     */
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a);
        System.out.println(a.toString());

        Student stu = new Student("张三",23);
        System.out.println(stu.toString());
    }
}

class A {
    @Override
    public String toString() {
        return "我重写了toString方法";
    }
}
