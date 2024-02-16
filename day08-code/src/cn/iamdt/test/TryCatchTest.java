package cn.iamdt.test;

import cn.iamdt.domain.Student;
import cn.iamdt.exception.StudentAgeException;

import java.util.Scanner;

public class TryCatchTest {
    /*
        需求：键盘录入学生的姓名和年龄，封装为Student学生对象
     */
    public static void main(String[] args) {
        Student stu = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        stu.setName(name);

        System.out.println("请输入学生年龄：");

        int age = 0;

        while (true) {
            try {
                age = Integer.parseInt(sc.nextLine());
                stu.setAge(age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("年龄输入异常，请重新输入：");
            } catch (StudentAgeException e) {
                String message = e.getMessage();
                System.out.println(message);
            }
        }

        System.out.println(stu);
    }
}
