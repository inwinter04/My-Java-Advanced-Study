package cn.iamdt.mstatic;

public class StaticDemo1 {
    /*
        static 关键字 : 修饰符，可以修饰成员变量，成员方法

        特点：
                1. 被类的所有对象所共享
                2. 多了一种调用方式，可以通过类名进行调用（推荐使用类名进行调用）
                3. 随着类的加载而加载，优先于对象存在
     */
    public static void main(String[] args) {
        Student.school = "传智专修学院";                  // 随着类的加载而加载，优先于对象存在

        Student stu1 = new Student();
        stu1.name = "张三";
        stu1.age = 23;
        stu1.school = "传智专修学院";
        System.out.println(stu1.name + "---" + stu1.age + "---" + stu1.school);

        Student stu2 = new Student();
        stu2.name = "李四";
        stu2.age = 24;
        // stu2未被赋值，但与stu1.school共享
        System.out.println(stu2.name + "---" + stu2.age + "---" + stu2.school);

        Student stu3 = new Student();
        System.out.println(stu3.name + "---" + stu3.age + "---" + Student.school);      // static修辞的成员变量可以通过类名进行调用
    }
}
