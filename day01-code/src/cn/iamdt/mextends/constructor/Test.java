package cn.iamdt.mextends.constructor;

public class Test {
    /*
        程序执行结果：
            Fu类的空参构造方法
            Zi类的空参构造方法
            Fu类的空参构造方法
            Zi类的带参构造方法...
     */

    /*
        除了Object类，在所有构造方法的第一行代码，都默认隐藏了一句 super();
        通过这句代码，访问父类的空参构造方法

        细节：Java当中所有的类，都直接或者间接的继承到了 Object 类
     */
    public static void main(String[] args) {
        Zi z = new Zi();            // 子类空参构造
        Zi zi = new Zi(10);    // 子类带参构造
    }
}

class Fu{
    public Fu(){
        System.out.println("Fu类的空参构造方法");
    }

    public Fu(int num){
        System.out.println("Fu类的带参构造方法...");
    }
}

class Zi extends Fu{

    public Zi(){
        // super();     // 此语句将会默认添加至子类
        System.out.println("Zi类的空参构造方法");
    }

    public Zi(int num){
        // super();     // 此语句将会默认添加至子类
        System.out.println("Zi类的带参构造方法...");
    }
}
