package cn.iamdt.mfinal;

public class FinalDemo {
    /*
        final : 修饰符，可用于修饰方法，类，变量

        特点:
                修饰方法：表明该方法是最终方法，不能被重写
                修饰类，表明该类是最终类，不能被继承
                修饰变量：表明该变量是常量，不能再次被赋值

                                    final修饰变量的命名规范 :

                                            如果变量是一个单词，所有字母大写 max Max
                                            如果变量名是多个单词，所有单词大写，中间使用下划线分割 maxValue    MAX_VALUE

      ---------------------------------------------------------

                基本数据类型：数据值不可改变
                引用数据类型：地址值不可改变，但是内容可以改变

      ---------------------------------------------------------

      final修饰成员变量的注意事项 :

                1. final修饰成员变量，不允许修饰默认值
                2. final修饰成员变量的初始化时机

                                1). 在定义时直接赋值
                                2). 在构造方法中完成赋值
     */
    public static void main(String[] args) {

        final int[] arr = {11, 22, 33};

        // arr = new int[3];

        arr[0] = 100;

        System.out.println(arr[0]);

    }
}

class Student {
    final int num;

    public Student() {
        num = 0;
    }
}

final class Fu {
    public void method() {
        System.out.println("父类中非常重要的方法，不希望子类进行重写");
    }

    public final void show() {

    }

    public void print() {

    }
}

class Zi {

}

