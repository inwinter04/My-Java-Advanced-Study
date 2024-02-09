package cn.iamdt.test;

import java.util.Calendar;

public class CalendarTest1 {
    /*
        需求 : 使用程序判断出 2050年3月1日 是否为疯狂星期四
     */
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        c.set(2050, 2, 1);
        if (c.get(Calendar.DAY_OF_MONTH) == 5) {
            System.out.println("今天为疯狂星期四！");
        } else {
            System.out.println("今天不是疯狂星期四...");
        }
    }
}
