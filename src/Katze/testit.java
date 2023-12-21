package Katze;

import java.util.ArrayList;
import java.util.Random;
public class testit {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Katze> mKatzenListe = new ArrayList();
        Katze katze = new Katze();
        String[] charListe ={"gutartig","hinterhältig","Listig","schmusig","lieblich","lustig"};
        String[] oberListe ={"weich","nass","kuschelig","stränig","hart"};
        String[] nameListe ={"Nussnuggat","Nuggat","Caramell","Schoko","Milky"};
        String[] farbeListe ={"schwarz","grau","weiß","braun","lecker"};

        for (int i = 1; i<=1; i++) {
            //int randomNumber = random.next.Int(max + 1 -main) +min;
            int ch = r.nextInt(charListe.length-1-0)+0;
            int ob = r.nextInt(oberListe.length-1-0)+0;
            int na = r.nextInt(nameListe.length-1-0)+0;
            int fa = r.nextInt(farbeListe.length-1-0)+0;
            int al = r.nextInt(25+1-0)+0;
            mKatzenListe.add(new Katze(charListe[ch],oberListe[ob],al,farbeListe[fa],nameListe[na]));
        }

        //katze.setAlter(1);
        //katze.setCharakter("bösartig");
        //katze.setFarbe("karriert");
        //katze.setOberflaechenbeschaffenheit("flauschig");
        //katze.setName("Mitzi");

        //Katze katze2 = new Katze(charListe[0],"nackt",5,"rosa","Nackibuz");
        //mKatzenListe.add(katze2);

        for(Katze k : mKatzenListe){
            System.out.println("Meine Katze "+k.getName()+" ist "+k.getAlter()+ " Jahr alt und richtig "+ k.getCharakter()+
                    ". Aber sie ist auch " + k.getFarbe() + " und "+ k.getOberflaechenbeschaffenheit()+".");

        }
    }
}

