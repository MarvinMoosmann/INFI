package at.mma.basics;

import java.util.Random;

public class Switch {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(5,11);
        System.out.println(randomNumber);
        switch (randomNumber){
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 10:
                System.out.println("Ten");
                break;

        }
    }
}
