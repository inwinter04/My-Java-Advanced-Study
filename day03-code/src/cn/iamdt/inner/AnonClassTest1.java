package cn.iamdt.inner;

public class AnonClassTest1 {
    /*
        匿名内部类：

            概述：匿名内部类本质上是一个特殊的局部内部类（定义在方法内部）
            前提：需要存在一个接口或类
            格式：
                    new 类名/接口名 () {

                    }

                    new 类名(){}    :   代表继承这个类
                    new 接口名(){}   :   代表实现这个接口
     */
    public static void main(String[] args) {

        // 问题：方法的形参是接口类型，我们该传入的是什么？
        // 答案：传入的是该接口的实现类对象

        // 编写类实现接口后传入方法(方法重写较少时步骤过于复杂)
        useInter(new InterImpl());

        // 匿名内部类调用方法
        useInter(new Inter() {
            @Override
            public void show() {
                System.out.println("Inter...show...");
            }
        });
    }

    public static void useInter(Inter i) {
        i.show();
    }
}

interface Inter {
    void show();
}

class InterImpl implements Inter {

    @Override
    public void show() {
        System.out.println("InterImpl...show...");
    }
}
