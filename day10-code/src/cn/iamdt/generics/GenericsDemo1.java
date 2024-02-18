package cn.iamdt.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class GenericsDemo1 {
    /*
        泛型介绍 ： JDK5引入的，可以在编译阶段约束操作的数据类型，并进行检查

        泛型的好处 ：
                    1. 统一数据类型
                    2. 将运行期的错误提升到了编译期

         泛型的学习路径 ：
                    1. 泛型类
                    2. 泛型方法
                    3. 泛型接口
                    4. 泛型通配符
                    5. 泛型的限定
     */
    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add("张三");
        list.add("李四");
        list.add("王五");
        // 未将运行期的错误提升到了编译期
        list.add(new Random());     // ClassCastException 由于未统一数据类型，在28行转型时发生错误

        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            // o.length();     // 编译检查父类，父类中无length方法，代码无法运行
            String s = (String) o;      // 向下转型
            System.out.println(s.length());
        }
    }
}
