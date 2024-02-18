package cn.iamdt.generics;

import java.util.ArrayList;

public class GenericsDemo5 {
    /*
        泛型通配符

              ? : 任意类型

              ? extends E : 可以传入的是E，或者是E的子类

              ? super E : 可以传入的是E，或者是E的父类
     */
    public static void main(String[] args) {

        ArrayList<Coder> list1 = new ArrayList<>();
        ArrayList<Manager> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        list1.add(new Coder());
        list2.add(new Manager());
        list3.add(111);

        method(list1);
        method(list2);
        // method(list3);      // ClassCastException 类型转换异常，在没有限定泛型时method执行强转会出现此错误
        // 限定泛型后method(list3) 编译过不去
    }

    public static void method(ArrayList<? extends Employee> list) {
        for (Object o : list) {
            Employee e = (Employee) o;
            e.work();
        }
    }
}

abstract class Employee {
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract void work();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Coder extends Employee {

    @Override
    public void work() {
        System.out.println("程序员写代码...");
    }
}

class Manager extends Employee {

    @Override
    public void work() {
        System.out.println("项目经理分配任务...");
    }
}
