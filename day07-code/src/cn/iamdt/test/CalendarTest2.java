package cn.iamdt.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalendarTest2 {
    /*
        需求 : 键盘录入一个日期字符串,  程序输出这个日期是一年中的第多少天

                1. 使用SimpleDateFormat,  将日期字符串转换为日期对象
                2. 将日期对象, 转换为Calendar对象
                3. 调用get方法, 获取一年中的第几天
     */
    public static void main(String[] args) throws ParseException {
        // 1. 键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入日期(xxxx年xx月xx日):");
        String dateString = sc.nextLine();

        // 2. 使用SimpleDateFormat将日期字符串转换为日期对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        Date dateFormat = simpleDateFormat.parse(dateString);

        // 3. 将日期对象转换为Calendar对象
        Calendar c = Calendar.getInstance();
        c.setTime(dateFormat);

        // 4. 调用get方法，获取一年中的第几天
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
    }
}
