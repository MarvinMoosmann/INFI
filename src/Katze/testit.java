package Katze;

import java.util.ArrayList;
import java.util.Random;

public class testit {
    public static void main(String[] args){
        Random r = new Random();
        ArrayList<Katze> mKatzenListe = new ArrayList();
        Katze katze = new Katze();
        String[] charListe ={"bösartig","gutartig","hinterhältig","listig","schmusig","lieblich"};
        String[] oberListe ={"weich","hart","nass","hässlich","Elias Frisur","wie Elias hässlich Katze"};
        String[] namenListe ={"Elias","Elija","Marvin","Dine Mom","Non-Binare","Kratzer in Elijas Handy"};
        String[] farbeListe ={"weiß","schwarz","beides","alles","rainbow","hässlich"};


        for (int i=1; i<=100; i++){
            int ci = r.nextInt(charListe.length - 1 -0)+0;
            int oi = r.nextInt(oberListe.length - 1 -0)+0;
            int ni = r.nextInt(namenListe.length - 1 -0)+0;
            int fi = r.nextInt(farbeListe.length - 1 -0)+0;
            int ai = r.nextInt(25 + 1 -0)+0;
            mKatzenListe.add(new Katze(charListe[ci],oberListe[oi],ai,farbeListe[fi],namenListe[ni]));

        }
        mKatzenListe.add(katze);
        katze.setAlter(1);
        katze.setCharacter("bösartig");
        katze.setFarbe("karriert");
        katze.setOberflaechenbeschaffenheit("flauschig");
        katze.setName("Mitzi");

        Katze katze2 = new Katze("nette","nackt",5,"rosa","Nackibutz");
        mKatzenListe.add(katze2);
        // System.out.println("Meine Katze "+katze.getName() +" ist "+ katze.getAlter() + " alt!");

        int katzenzaehler = 1;

        Haus haus = new Haus (350, "Buxdehude 4, 388732 Hamburg", 8, 5);
        haus.getInfo();
        //haus.addKatze (katze2);
        //haus.addKatze(katze);

        for(Katze k: mKatzenListe){
            System.out.println("Meine Katze "+k.getName() +" ist "+ k.getAlter() + " alt," + k.getCharacter() + ", "+k.getName() + ", " + k.getOberflaechenbeschaffenheit());
            haus.addKatze(k);
        }
        haus.getKatzeImHaus();
    }

}