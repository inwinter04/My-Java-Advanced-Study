package cn.iamdt.lambda.test;

public class LambdaTest1 {
    public static void main(String[] args) {
        useShowHandler(new ShowHandler() {
            @Override
            public void show() {
                System.out.println("我是匿名内部类重写后的方法show....");
            }
        });

        System.out.println("------------------------------");

        useShowHandler(() -> System.out.println("我是Lambda表达式重写后的方法show...."));
    }

    public static void useShowHandler(ShowHandler showHandler) {
        showHandler.show();
    }
}

interface ShowHandler {
    void show();
}
