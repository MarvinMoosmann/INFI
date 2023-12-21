package at.mma.basics;

import java.util.Scanner;

public class Bank {
    private static double kontostand = 0.0; // Anfangsbetrag

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int auswahl;

        System.out.println("1. Einzahlen");
        System.out.println("2. Abheben");
        System.out.println("3. Kontostand");
        System.out.println("4. Beenden");
        System.out.print("Bitte wählen Sie eine Option: ");

        do {
            auswahl = scanner.nextInt();

            switch (auswahl) {
                case 1:
                    einzahlen();
                    break;
                case 2:
                    abheben();
                    break;
                case 3:
                    kontostandAnzeigen();
                    break;
                case 4:
                    System.out.println("Vielen Dank für die Nutzung des Bankautomaten. Auf Wiedersehen!");
                    break;
                default:
                    System.out.println("Ungültige Auswahl. Bitte versuchen Sie es erneut.");
            }

        } while (auswahl != 4);

        scanner.close();
    }

    private static void einzahlen() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie den Einzahlungsbetrag ein: ");
        double betrag = scanner.nextDouble();
        if (betrag > 0) {
            kontostand = kontostand + betrag;
            System.out.println("Einzahlung erfolgreich. Neuer Kontostand: " + kontostand);
        } else {
            System.out.println("Ungültiger Betrag. Einzahlung fehlgeschlagen.");
        }
    }

    private static void abheben() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie den Abhebungsbetrag ein: ");
        double betrag = scanner.nextDouble();
        if (betrag > 0 && betrag <= kontostand) {
            kontostand -= betrag;
            System.out.println("Abhebung erfolgreich. Neuer Kontostand: " + kontostand);
        } else {
            System.out.println("Ungültiger Betrag oder nicht ausreichendes Guthaben. Abhebung fehlgeschlagen.");
        }
    }

    private static void kontostandAnzeigen() {
        System.out.println("Aktueller Kontostand: " + kontostand);
    }
}