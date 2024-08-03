package Collatz;

import Model.Vererbung.InttelligenteTiere;
import Model.Vererbung.Lebewesen;

// mit dem extends sagen wir das die Klasse durch Lebewesen erweitert wird
public class Collatz {
private int Zahl;
    public Collatz(int Zahl){
        dotheThing(Zahl);
    }

 public void dotheThing(int Zahl){
        this.Zahl= Zahl;
        boolean vier= false;
        boolean zwei= false;
        boolean eins= false;

        while (Zahl != 1){
            if (Zahl %2 >0){
                 Zahl = Zahl*3 +1;
            }else{
                Zahl= Zahl /2;
//              if(Zahl ==4){
//                    vier= true;
//                } if(Zahl ==2){
//                    zwei= true;
//                }if(Zahl ==1){
//                    eins= true;
//                }
            }
            System.out.println(Zahl);
        }
//        if(vier&&zwei&&eins){
//           System.out.println("Richtig!");
//        }else{
//            System.out.println("FALSCH!!!!");
//     }
    }
}
