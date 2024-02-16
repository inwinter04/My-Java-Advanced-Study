package cn.iamdt.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo2 {
    /*
        编译时异常 : 编译阶段就出现的错误（语法错误不算）
                        - 需要在运行之前，给出解决方案
        运行时异常 : 编译过了，运行期间 [可能会出现的错误]
     */
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse("2008年8月8日");
        System.out.println(date);
    }
}
