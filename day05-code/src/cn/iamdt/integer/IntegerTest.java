package cn.iamdt.integer;

public class IntegerTest {
    /*
        已知字符串 String s = "10,50,30,20,40";
        请将该字符串转换为整数并存入数组
        随后求出最大值打印在控制台
     */
    public static void main(String[] args) {
        String s = "10,50,30,20,40";
        String[] li1 = s.split(",");
        int[] li2 = new int[s.length()];

        for (int i = 0; i < li1.length; i++) {
            li2[i] = Integer.parseInt(li1[i]);
        }

        int max = li2[0];
        for (int i = 1; i < li2.length; i++) {
            if (li2[i] > max) {
                max = li2[i];
            }
        }

        System.out.println("最大值为:" + max);
    }
}
