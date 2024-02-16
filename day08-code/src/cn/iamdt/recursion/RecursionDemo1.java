package cn.iamdt.recursion;

public class RecursionDemo1 {
    /*
        递归介绍：方法直接或间接调用本身
     */
    public static void main(String[] args) {
        // StackOverflowError 堆内存溢出异常
        // 由于递归未设置程序出口导致堆内存溢出
        methodA();
    }

    public static void methodA() {
        methodB();
    }

    public static void methodB() {
        methodC();
    }

    public static void methodC() {
        methodA();
    }
}
