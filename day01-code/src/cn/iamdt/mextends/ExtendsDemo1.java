package cn.iamdt.mextends;

public class ExtendsDemo1 {
    /*
        继承：类与类之间产生关系（子父类关系），子类就可以直接使用父类中，非私有的成员
     */
    public static void main(String[] args) {
        Coder c = new Coder();
        c.name = "张三";
        c.age = 23;
        c.salary = 12000;
    }
}

class Employee {
    String name;
    int age;
    double salary;
}

/**
 * 创建类的细节：
 * 一个.java文件中可以编写多个class
 * 1. 保证类与类之间是平级关系
 * 2. 只能有一个被public修饰
 */
class Coder extends Employee {
}

class Manager extends Employee {

}
