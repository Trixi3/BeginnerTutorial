package Model;
//importieren von Komponenten für die Klasse
import java.util.Date;
//Der Aufruf einer Klasse
public class Person {
    //Der Konstruktor (wird gerufen um bei Erzeugung des Objekts Code auszuführen)
    public Person(){
    this.name = "Hans";
    this.zeitstempel = new Date();
    }
    // Attribute die von er Klasse genutzt werden
    private String name;

    private Date geburtsdatum;

    private int alter;

    private double körpergröße;

    private Date zeitstempel;

    // Methoden zum Ausgeben (Get) und Bearbeiten (Set)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(Date geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public double getKörpergröße() {
        return körpergröße;
    }

    public void setKörpergröße(double körpergröße) {
        this.körpergröße = körpergröße;
    }

    public Date getZeitstempel() {
        return zeitstempel;
    }

    public void setZeitstempel(Date zeitstempel) {
        this.zeitstempel = zeitstempel;
    }
}
