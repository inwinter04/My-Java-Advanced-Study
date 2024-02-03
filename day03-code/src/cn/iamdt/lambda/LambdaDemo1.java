package cn.iamdt.lambda;

public class LambdaDemo1 {
    /*
        作用：简化匿名内部类的代码写法。
        格式：() -> {}

                () : 匿名内部类被重写方法的形参列表
                {} : 被重写方法的方法体代码
     */
    public static void main(String[] args) {
        useInterA(new InterA() {
            @Override
            public void show() {
                System.out.println("匿名内部类，重写后的show方法...");
            }
        });

        System.out.println("-------------------------");

        useInterA(() -> {
            System.out.println("匿名内部类，重写后的show方法...");
        });
    }

    public static void useInterA(InterA a) {
        a.show();
    }
}

interface InterA {
    void show();
}
