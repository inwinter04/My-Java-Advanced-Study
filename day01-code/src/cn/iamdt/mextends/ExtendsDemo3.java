package cn.iamdt.mextends;

import java.sql.SQLOutput;

public class ExtendsDemo3 {
    /*
        方法重载(Overload) : 在同一个类中，方法名相同，参数不同，与返回值无关
                               参数不同：类型不同，个数不同，顺序不同

        方法重写(Override) : 在子父类当中，出现了方法声明一模一样的方法 (方法名，参数，返回值)
     */
    public static void main(String[] args) {
        Son s = new Son();
        s.method();
    }
}

class Father {
    public void method(){
        System.out.println("Father...method");
    }

    void method2(){
        System.out.println("method2...Father");
    }
}

class Son extends Father {
    @Override
    public void method() {
        // super.method();
        System.out.println("Son...method");
    }

    /*
        子类重写父类方法时，访问权限必须大于等于父类
     */
    public void method2(){              // 父类访问权限为default，子类必须大于等于default权限
        System.out.println("method2...Son");
    }
}
