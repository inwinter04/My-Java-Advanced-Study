package cn.iamdt.this_super;

public class Test {
    /*
        需求：项目1.0版本：有3个成员变量
             项目1.1版本：新增1个成员变量
     */
    /*
        开闭原则：对功能扩展做开放，对修改代码做关闭
     */
    public static void main(String[] args) {
        A a1 = new A(11, 22, 33);
        A a2 = new A(1, 2, 3);

        A a3 = new A(10, 20, 30, 40);
    }
}

class A {
    int a;
    int b;
    int c;
    int d;


    public A() {
    }

    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public A(int a, int b, int c, int d) {
        this(a, b, c);
        this.d = d;
    }
}
