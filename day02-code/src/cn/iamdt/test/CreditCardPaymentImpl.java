package cn.iamdt.test;

public class CreditCardPaymentImpl implements Payment {
    @Override
    public void pay(double money) {
        System.out.println("通过银行卡快捷支付了:" + money + "元!");
    }
}
