package cn.iamdt.design.adapter;

public class AdapterTest2 {
    /*
        适配器设计模式
     */
    public static void main(String[] args) {

    }
}

interface 和尚 {
    void 打坐();

    void 念经();

    void 撞钟();

    void 习武();
}

abstract class 和尚Adapter implements 和尚 {
    @Override
    public void 打坐() {

    }

    @Override
    public void 念经() {

    }

    @Override
    public void 撞钟() {

    }

    @Override
    public void 习武() {

    }
}

class 鲁智深 extends 和尚Adapter {
    @Override
    public void 习武() {
        System.out.println("倒拔垂杨柳");
    }
}

class 唐僧 extends 和尚Adapter {
    @Override
    public void 打坐() {
        super.打坐();
    }

    @Override
    public void 念经() {
        super.念经();
    }

    @Override
    public void 撞钟() {
        super.撞钟();
    }
}
