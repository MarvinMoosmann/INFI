package at.mma.basics;

import java.util.Random;

public class While1 {
    public static void main(String[] args) {
        Random random = new Random();
        boolean isFinished = false;

        while (!isFinished) {
            int randomValue = random.nextInt(11, 30);
            System.out.println(randomValue);
            int summe = 0;
            for (int i = 1; i <= 100; i++) {
                summe += i;
                if ((randomValue == 15) || (randomValue == 25)) {
                    isFinished = true;
                }
            }
        }
    }
}