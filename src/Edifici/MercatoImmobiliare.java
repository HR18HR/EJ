package Edifici;

import java.util.ArrayList;

public class MercatoImmobiliare {
    private ArrayList<Appartamento> appartamenti=new ArrayList<>();


    public void addAppartamento(Appartamento appartamento){
        if(appartamento==null)throw new IllegalArgumentException();
        appartamenti.add(appartamento);
    }

    public float getValoreAppartamento(Appartamento appartamento){
        if(appartamento==null||!appartamenti.contains(appartamento))throw new IllegalArgumentException();
        float i=0;
        for(Appartamento appartamento1:appartamenti){
            i+=appartamento.getPrezzo()/appartamento.getSuperficie();
        }
        return i*appartamento.getSuperficie();
    }
}
