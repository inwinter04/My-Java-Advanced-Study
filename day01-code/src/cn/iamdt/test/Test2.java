package cn.iamdt.test;

public class Test2 {
    public static void main(String[] args) {
        Coder coder = new Coder("张三",23,15000);
        coder.work();

        Manager manager = new Manager("李四",24,18000,5000);
        manager.work();
    }
}
