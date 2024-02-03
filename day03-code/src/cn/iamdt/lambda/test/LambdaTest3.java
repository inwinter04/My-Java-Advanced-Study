package cn.iamdt.lambda.test;

import java.util.Random;

public class LambdaTest3 {
    public static void main(String[] args) {
        useRandNumHandler(new RandomNumHandler() {
            @Override
            public int getNumber() {
                return new Random().nextInt(100) + 1;
            }
        });

        System.out.println("----------------------------");

        useRandNumHandler(() -> new Random().nextInt(100) + 1);
    }

    public static void useRandNumHandler(RandomNumHandler randomNumHandler) {
        int result = randomNumHandler.getNumber();
        System.out.println(result);
    }
}

interface RandomNumHandler {
    int getNumber();
}
