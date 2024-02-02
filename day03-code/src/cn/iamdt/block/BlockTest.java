package cn.iamdt.block;

public class BlockTest {
    /*
        代码块 : 使用 { } 括起来的代码称为代码块

        分类 :
                1. 局部代码块
                        位置：方法中的一对大括号
                        作用：限定变量的生命周期，提早释放内存

                2. 构造代码块
                        位置：类中方法外的一对大括号
                        特点：在创建对象中，重复的代码，抽取到构造代码块中，从而提升代码的复用性
                3. 静态代码块
                        位置：类中方法外的一对大括号，需要加入static关键字
                        特点：随着类的加载而执行，因为类只加载一次，所以也就执行一次
                        作用：对数据进行初始化
     */
    public static void main(String[] args) {
        // 局部代码块
        {
            int num = 10;
            System.out.println(num);
        }
        // num = 30;        // 无法解析符号 'num'。局部代码块内的代码执行完毕后释放内存，内存中无num变量

        System.out.println("-----------------------------------");

        Student stu1 = new Student();
        Student stu2 = new Student(10);
    }
}

class Student {
    // 构造代码块
    {
        System.out.println("Student类的构造代码块");
        System.out.println("学生好好学习");
    }

    static {
        System.out.println("static...Student类的静态代码块");
    }

    public Student() {
        System.out.println("Student的空参构造方法");
    }

    public Student(int num) {
        System.out.println("Student的带参构造方法");
    }
}
