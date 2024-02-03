package cn.iamdt.lambda.a;

public class LambdaDemo3 {
    /*
        匿名内部类编译后会创建一份独立的字节码文件
        而lambda表达式不会创建字节码文件
     */
    public static void main(String[] args) {

        use(new A() {
            @Override
            public void method() {
                System.out.println("匿名内部类...");
            }
        });

        use(new A() {
            @Override
            public void method() {
                System.out.println("匿名内部类...");
            }
        });

        use(() -> System.out.println("匿名内部类..."));
    }

    public static void use(A a) {
        a.method();
    }
}

interface A {
    void method();
}
