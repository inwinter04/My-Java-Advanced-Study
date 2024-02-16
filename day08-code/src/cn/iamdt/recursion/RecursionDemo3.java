package cn.iamdt.recursion;

public class RecursionDemo3 {
    /*
        不死神兔（斐波那契数列）
     */
    public static void main(String[] args) {
        System.out.println(get(20));
    }

    public static int get(int month) {
        if (month == 1 || month == 2) {
            return 1;
        } else {
            return get(month - 1) + get(month - 2);
        }
    }
}
