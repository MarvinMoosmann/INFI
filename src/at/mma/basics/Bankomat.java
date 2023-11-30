package at.mma.basics;

import java.util.Scanner;

public class Bankomat {

    public static void main(String[] args) {
        double kontostand = 0.0;

        System.out.println("1 drücken, um eine Summe einzuzahlen");
        System.out.println("2 drücken, um eine Summe abzuheben");
        System.out.println("3 drücken, um eine Summe Ihren Kontostand zu sehen");
        System.out.println("4 drücken, um den Bankomaten zu beenden");

        Scanner scanner = new Scanner(System.in);
        boolean isFinished = false;
        while (!isFinished) {
            int s = scanner.nextInt();

            if (s==1) {
                System.out.println("Welchen Betrag wollen Sie einzahlen?");
                int e = scanner.nextInt();
                System.out.println("Einzahlung: " + e+kontostand);
            }
            if (s==2) {
                System.out.println("Welchen Betrag wollen Sie abheben?");
                int a = scanner.nextInt();
                System.out.println("Abhebung: " + a+kontostand);
            }
            if (s==3) {
                System.out.println("Kontostand: " + kontostand);
            }
            if (s==4) {
                System.out.println("Bankomat wurde beendet");
                isFinished=true;
            }
        }
    }
}

