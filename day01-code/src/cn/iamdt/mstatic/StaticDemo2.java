package cn.iamdt.mstatic;

public class StaticDemo2 {
    static int num1 = 10;
    int num2 = 20;

    public static void method(){
        System.out.println("static...method");
    }

    public  void print(){
        System.out.println("print..");
    }

    public static void main(String[] args) {
        System.out.println(num1);       // 在静态方法中，只能访问静态成员（直接访问）
        method();

        // System.out.println(num2);    // 无法访问
        // print();

        StaticDemo2 sd = new StaticDemo2();
        System.out.println(sd.num2);
        sd.print();
    }
}
