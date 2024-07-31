import Model.Person;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
    Wohnung wohnung = new Wohnung();
        System.out.println(wohnung);
    Person Objekt = new Person();
    Objekt.setAlter(21);

    System.out.println(Objekt.getAlter());
    }
}