package cn.iamdt.args;

public class ArgsDemo {
    public static void main(String[] args) {

        System.out.println(getSum(1, 2, 3));
        System.out.println(getSum(1, 2, 3, 4));

    }

    // 若有多个参数，可变参数必须放在最后。且不允许定义多个可变参数
    public static int getSum(int... nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}
