package cn.iamdt.homework;

import cn.iamdt.exception.StudentAgeException;
import cn.iamdt.homework.domain.Student;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            Student stu = new Student();
            int age = 0;
            double mathScore = 0;
            double chineseScore = 0;
            double englishScore = 0;

            System.out.println("请输入学生姓名：");
            String name = sc.nextLine();
            stu.setName(name);

            System.out.println("请输入学生年龄：");

            while (true) {
                try {
                    age = Integer.parseInt(sc.nextLine());
                    stu.setAge(age);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("输入有误，请重新输入：");
                } catch (StudentAgeException e) {
                    String message = e.getMessage();
                    System.out.println(message);
                }
            }

            System.out.println("请输入学生数学成绩：");
            while (true) {
                try {
                    mathScore = Double.parseDouble(sc.nextLine());
                    stu.setMathScore(mathScore);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("输入有误，请重新输入：");
                } catch (StudentScoreException e) {
                    String message = e.getMessage();
                    System.out.println(message);
                }
            }


            System.out.println("请输入学生语文成绩：");
            while (true) {
                try {
                    chineseScore = Double.parseDouble(sc.nextLine());
                    stu.setChineseScore(chineseScore);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("输入有误，请重新输入：");
                } catch (StudentScoreException e) {
                    String message = e.getMessage();
                    System.out.println(message);
                }
            }

            System.out.println("请输入学生英语成绩：");
            while (true) {
                try {
                    englishScore = Double.parseDouble(sc.nextLine());
                    stu.setEnglishScore(englishScore);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("输入有误，请重新输入：");
                } catch (StudentScoreException e) {
                    String message = e.getMessage();
                    System.out.println(message);
                }
            }
            System.out.println(stu);
        }
    }
}
