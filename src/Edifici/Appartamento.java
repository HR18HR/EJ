package Edifici;

import java.util.ArrayList;

public class Appartamento {
    private float prezzo;
    private ArrayList<Stanza> stanze;
    public Appartamento(float prezzo, ArrayList<Stanza> stanze) {
        if(stanze==null||stanze.isEmpty())throw new IllegalArgumentException();
        this.prezzo = prezzo;
    }
    public float getPrezzo() {
        return prezzo;
    }
    public float getSuperficie() {
        float i=0;
        for(Stanza stanza:stanze){
            i+=stanza.getSuperficie();
        }
        return i;
    }
    public float getVolume(){
        float i=0;
        for(Stanza s:stanze){
            i+=s.getVolume();
        }
        return i;
    }
}
