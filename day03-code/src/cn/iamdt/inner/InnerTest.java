package cn.iamdt.inner;

public class InnerTest {
    /*
        内部类：在类中定义的类

        创建对象格式：外部类名.内部类名 对象名 = new 外部类对象().new 内部类对象();

        成员访问细节：

                    1. 内部类中，访问外部类成员 ： 直接访问，包括私有
                    2. 外部类中，访问内部类成员 ： 需要创建对象访问
     */
    public static void main(String[] args) {
        // 内部类创建对象的格式
        outer.inner oi = new outer().new inner();
        oi.show();

        System.out.println("----------------------");

        MyOuter.MyInner mm = new MyOuter().new MyInner();
        mm.show();
    }
}

class outer {
    private void method() {
        System.out.println("outer...show");
        // 外部类访问内部类的成员需创建对象
        inner i = new inner();
        System.out.println(i.num);
    }

    class inner {
        int num = 10;

        public void show() {
            System.out.println("inner...show");
            System.out.println(num);
            System.out.println("--------");
            // 内部类可直接访问外部类，包括私有方法
            method();
        }
    }
}

/**
 * 面试题
 */
class MyOuter {

    int num = 10;

    class MyInner {
        int num = 20;

        public void show() {
            int num = 30;

            System.out.println(num);                         // 30
            System.out.println(this.num);                    // 20
            System.out.println(MyOuter.this.num);            // 10
        }
    }
}

