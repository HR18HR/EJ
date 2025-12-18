package eserci;

import java.util.ArrayList;
import java.util.List;

public class Appartamento {
    private float valore;
    List<Stanza> appartamenti;
    public Appartamento(List<Stanza> appartamenti, float valore) {
        this.appartamenti = appartamenti;
        this.valore = valore;//valore
    }

    public float getValore() {
        return valore;
    }
    public float Superfice(){
        float superfice = 0;
        for(Stanza s : appartamenti){
            superfice+=s.Superfice();
        }
        return superfice;
    }
    public float getVolume(){
        float volume = 0;
        for(Stanza s : appartamenti){
            volume+=s.Volume();
        }
        return volume;
    }

}
