package Model.Vererbung;

import java.util.Date;


//Diese Klasse wird Vererbt
public class Lebewesen {
    private int alter;

    private Date geburtsdatum;

    private String name;

    public String fortbewegung(){
        return "ich kann laufen";
    }
    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public Date getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(Date geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
