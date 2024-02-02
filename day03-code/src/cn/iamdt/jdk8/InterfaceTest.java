package cn.iamdt.jdk8;

public class InterfaceTest {
    /*
        JDK8版本接口特性：

            1. 允许定义非抽象方法，需要加入default关键字

                    - 作用：解决接口升级问题
                    - 注意事项：
                                1. public可以省略，但default不可省略
                                2. 默认方法，实现类是允许重写的，但是需要去掉default关键字
                                3. 如果实现了多个接口，多个接口中存在相同的默认方法，实现类必须重写

            2. 允许定义静态方法

                     - 理解：既然接口已经允许方法带有方法体了，干脆也开放静态方法，可以类名调用

                     - 注意事项：

                                 1. public可以省略但static不能省略
                                 2. 接口中的静态方法，只允许接口名进行调用，不允许实现类通过对象调用
     */
    public static void main(String[] args) {
        AInterImpl a = new AInterImpl();
        a.method();
        A.methodA();
    }
}

interface A {
    default void method() {
        System.out.println("A...method");
    }

    static void methodA() {
        System.out.println("A...methodA");
    }
}

interface Inter {
    void show();

    void print();

    default void method() {
        System.out.println("Inter...method");
    }
}

class AInterImpl implements Inter, A {
    @Override
    public void method() {
        Inter.super.method();
        System.out.println("AInterImpl...method");
        A.super.method();
    }

    @Override
    public void show() {
        System.out.println("AInterImpl...show");
    }

    @Override
    public void print() {
        System.out.println("AInterImpl...print");
    }
}

class BInterImpl implements Inter {

    @Override
    public void show() {
        System.out.println("BInterImpl...show");
    }

    @Override
    public void print() {
        System.out.println("BInterImpl...print");
    }
}
