package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;
import java.util.Map;

public class Imenik {
    HashMap <String, TelefonskiBroj > telImenik;
    Imenik(){telImenik = new HashMap<>();}
    public void dodaj(String ime, TelefonskiBroj broj){
        telImenik.put(ime,broj);
    }
    public String dajBroj(String ime){
        return telImenik.get(ime).ispisi();
    }
    public String naSlovo(char s){
        int i=1;
        String rezultatPretrage = new String();
        for (Map.Entry<String,TelefonskiBroj> a: telImenik.entrySet()) {
            if(a.getKey().charAt(0) == s) {
                rezultatPretrage += i + "." + " " + a.getKey() + " - " + a.getValue().ispisi();
                i++;
            }
        }
        return rezultatPretrage;
    }
}
