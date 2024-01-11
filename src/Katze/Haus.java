package Katze;

import java.util.ArrayList;

public class Haus {
    private int flaeche;
    private String adresse;
    private int anzahlZimmer;
    private int maxkatzenimhaus;
    private ArrayList<Katze> katzenListe;

    public Haus(int flaeche, String adresse, int anzahlZimmer, int maxkatzenimhaus) {
        this.flaeche = flaeche;
        this.adresse = adresse;
        this.anzahlZimmer = anzahlZimmer;
        this.katzenListe = new ArrayList<>();
        this.maxkatzenimhaus = maxkatzenimhaus;
    }

    public int getFlaeche() {
        return flaeche;
    }

    public void setFlaeche(int flaeche) {
        this.flaeche = flaeche;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getAnzahlZimmer() {
        return anzahlZimmer;
    }

    public void setAnzahlZimmer(int anzahlZimmer) {
        this.anzahlZimmer = anzahlZimmer;
    }

    public int getMaxkatzenimhaus() {
        return maxkatzenimhaus;
    }

    public void setMaxkatzenimhaus(int maxkatzenimhaus) {
        this.maxkatzenimhaus = maxkatzenimhaus;
    }

    public void getInfo() {
        System.out.println("Adresse: " + this.adresse + "\nFlaeche: " + this.flaeche + "\nAnzahl Zimmer: " + this.anzahlZimmer);
    }

    public void addKatze(Katze katze) {
        if (katzenListe.size()  > (this.maxkatzenimhaus-1)){
            System.out.println("Der/die ChefIn will nicht mehr Katzen als" + this.maxkatzenimhaus + " im Haus!!");
        } else {
            katzenListe.add(katze);
        }
    }

    public void getKatzeImHaus(){
        for (Katze k : katzenListe){
            k.getInfo();
        }
    }

}