package cn.iamdt.mextends;

public class ExtendsDemo4 {
    /*
        Java不支持多继承，但支持多层继承

     */
    public static void main(String[] args) {
        C c = new C();
        c.showC();
        c.showB();
        c.showA();
    }
}

class A {
    public void showA(){
        System.out.println("A...");
    }
}

class B extends A{
    public void showB(){
        System.out.println("B...");
    }
}

class C extends B{
    public void showC(){
        System.out.println("C...");
    }
}

