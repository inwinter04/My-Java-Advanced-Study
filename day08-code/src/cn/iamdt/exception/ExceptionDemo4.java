package cn.iamdt.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo4 {
    /*
        子类重写父类方法时，不能抛出父类没有的异常，或者比父类更大的异常
     */
    public static void main(String[] args) {

    }
}

class Fu {
    public void show() throws ParseException {

    }
}

class Zi extends Fu {
    @Override
    public void show() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse("2008年8月8日");
        System.out.println(date);
    }
}
