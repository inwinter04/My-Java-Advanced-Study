package cn.iamdt.test;

import cn.iamdt.jdk8.p8_interval.ChronoUnitDemo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CalculateAgeTest {
    /*
        需求 : 键盘录入用户生日，计算出用户的实际年龄
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的生日：");
        String birthday = sc.nextLine();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年M月d日");
        LocalDate birthdayDate = LocalDate.parse(birthday, dateTimeFormatter);

        LocalDate now = LocalDate.now();

        System.out.println("您已经" + ChronoUnit.YEARS.between(birthdayDate, now) + "岁了！");
    }
}
