package eserci;

import java.util.List;

public class MercatoImmobiliare {
    List<Appartamento> appartamenti;

    public void AddAppartamento(Appartamento appartamento){
        appartamenti.add(appartamento);
    }
    public float getValore(Appartamento appartamento){
        float valoremedio=0;
        for(Appartamento ap:appartamenti){
            valoremedio+=ap.getValore();
        }
        return (valoremedio/appartamenti.size())*appartamento.getValore();
        //ritorno valore medio per superfice///

    }
}
