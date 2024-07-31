package Model;

import Model.Vererbung.InttelligenteTiere;
import Model.Vererbung.Lebewesen;

// mit dem extends sagen wir das die Klasse durch Lebewesen erweitert wird
public class Fische extends Lebewesen implements InttelligenteTiere {

    @Override
    public String fortbewegung() {
        return "einfach schwimmen schwimmen schwimmen";
    }

    @Override
    public int zaehlen() {
        return 0;
    }
}
