package cn.iamdt.lambda.test;

public class LambdaTest2 {
    public static void main(String[] args) {
        useStringHandler(new StringHandler() {
            @Override
            public void printMessage(String msg) {
                System.out.println("匿名内部类打印：" + msg);
            }
        });

        System.out.println("-----------------------------");

        useStringHandler(msg -> System.out.println("Lambda打印：" + msg));
    }

    public static void useStringHandler(StringHandler stringHandler) {
        stringHandler.printMessage("iamdt");
    }
}

interface StringHandler {
    void printMessage(String msg);
}