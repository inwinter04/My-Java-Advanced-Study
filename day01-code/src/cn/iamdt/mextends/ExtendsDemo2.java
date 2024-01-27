package cn.iamdt.mextends;

public class ExtendsDemo2 {
    /*
        this  调用本类的成员方法
        super 调用父类的成员变量
     */
    public static void main(String[] args) {
        Zi z = new Zi();
        z.method();
        /*
            子父类中，出现了方法申明一模一样的方法（方法名，参数，返回值）
                        在创建子类对象，调用方法的时候，会优先使用子类的方法逻辑
                        这虽然是就近原则的现象，但其实是子类的方法，对子类的方法，进行了重写操作

             - 方法重写
         */
        z.method1();
    }
}

class Fu {
    int num = 10;
    public void method1(){
        System.out.println("Fu....show");
    }
}

class Zi extends Fu{
    int num = 20;

    public void method(){
        int num = 30;
        System.out.println(num);                     // 30
        System.out.println(this.num);                // 20
        System.out.println(super.num);               // 10
    }

    public void method1(){
        System.out.println("Zi...show");
    }
}
