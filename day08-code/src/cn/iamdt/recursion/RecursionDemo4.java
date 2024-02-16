package cn.iamdt.recursion;

public class RecursionDemo4 {
    public static void main(String[] args) {
        int num = monkey(1);
        System.out.println(num);
    }

    public static int monkey(int day) {
        if (day == 10) {
            return 1;
        } else {
            return (monkey(day + 1) + 1) * 2;
        }
    }
}
