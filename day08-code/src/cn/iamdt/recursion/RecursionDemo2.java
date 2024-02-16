package cn.iamdt.recursion;

public class RecursionDemo2 {
    /*
        使用递归计算出5的阶乘

        求1~5的和
     */
    public static void main(String[] args) {
        int result = jc(5);
        System.out.println(result);

        int result2 = qh(5);
        System.out.println(result2);
    }

    public static int jc(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * jc(num - 1);
        }
    }

    public static int qh(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + qh(num - 1);
        }
    }
}
