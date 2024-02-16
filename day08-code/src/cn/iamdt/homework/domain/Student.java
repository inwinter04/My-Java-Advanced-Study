package cn.iamdt.homework.domain;

import cn.iamdt.exception.StudentAgeException;
import cn.iamdt.homework.StudentScoreException;

public class Student {
    String name;
    int age;
    double mathScore;
    double chineseScore;
    double englishScore;


    public Student() {
    }

    public Student(String name, int age, double mathScore, double chineseScore, double englishScore) {
        this.name = name;
        setAge(age);
        setMathScore(mathScore);
        setChineseScore(chineseScore);
        setEnglishScore(englishScore);
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            throw new StudentAgeException("年龄有误，请输入0~120之间的数字");
        }
    }

    /**
     * 获取
     *
     * @return mathScore
     */
    public double getMathScore() {
        return mathScore;
    }

    /**
     * 设置
     *
     * @param mathScore
     */
    public void setMathScore(double mathScore) {
        if (mathScore >= 0 && mathScore <= 100) {
            this.mathScore = mathScore;
        } else {
            throw new StudentScoreException("成绩输入有误，不能大于100分");
        }
    }

    /**
     * 获取
     *
     * @return chineseScore
     */
    public double getChineseScore() {
        return chineseScore;
    }

    /**
     * 设置
     *
     * @param chineseScore
     */
    public void setChineseScore(double chineseScore) {
        if (chineseScore >= 0 && chineseScore <= 100) {
            this.chineseScore = chineseScore;
        } else {
            throw new StudentScoreException("成绩输入有误，不能大于100分");
        }
    }

    /**
     * 获取
     *
     * @return englishScore
     */
    public double getEnglishScore() {
        return englishScore;
    }

    /**
     * 设置
     *
     * @param englishScore
     */
    public void setEnglishScore(double englishScore) {
        if (englishScore >= 0 && englishScore <= 100) {
            this.englishScore = englishScore;
        } else {
            throw new StudentScoreException("成绩输入有误，不能大于100分");
        }
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", mathScore = " + mathScore + ", chineseScore = " + chineseScore + ", englishScore = " + englishScore + "}";
    }
}
