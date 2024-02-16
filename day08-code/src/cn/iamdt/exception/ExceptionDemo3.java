package cn.iamdt.exception;

public class ExceptionDemo3 {
    /*
        异常默认处理流程: 将异常向上抛给调用者
        下方示例流程: method发生ArithmeticException错误 -> 错误抛给主方法 -> 主方法抛给虚拟机 -> 反馈给调用者控制台输出错误信息 -> 虚拟机终止运行
     */
    public static void main(String[] args) {
        System.out.println("开始");
        method();                           // 异常上抛至调用者(主方法) new ArithmeticException
        System.out.println("结束");
    }

    public static void method() {
        System.out.println(10 / 0);         // 发生异常 new ArithmeticException
    }
}
