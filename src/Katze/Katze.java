package Katze;
public class Katze {
    private String character;
    private String oberflaechenbeschaffenheit;
    private int alter;
    private String farbe;
    private String name;

    public Katze() {
    }

    public Katze(String character, String oberflaechenbeschaffenheit, int alter, String farbe, String name) {
        this.character = character;
        this.oberflaechenbeschaffenheit = oberflaechenbeschaffenheit;
        this.alter = alter;
        this.farbe = farbe;
        this.name = name;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getOberflaechenbeschaffenheit() {
        return oberflaechenbeschaffenheit;
    }

    public void setOberflaechenbeschaffenheit(String oberflaechenbeschaffenheit) {
        this.oberflaechenbeschaffenheit = oberflaechenbeschaffenheit;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getInfo() {
        System.out.println("Name der Katze " + this.name +
                ", Farbe: " + this.farbe +
                ", Oberfläche: " + this.oberflaechenbeschaffenheit +
                ", Alter: " + this.alter +
                ", Charakter: " + this.character);
    }
}