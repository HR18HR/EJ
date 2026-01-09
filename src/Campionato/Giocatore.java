package Campionato;

import Scuola.Persona;

public class Giocatore extends Persona {
    private Squadra squadra;
    public Giocatore(String nome, String cognome, String id,Squadra squadra) {
        super(nome, cognome, id);
        try{
            if(squadra==null)
                throw new EccezzioneC("Squadra Non Trovata");
            this.squadra=squadra;
        }
        catch(EccezzioneC e){
            throw new RuntimeException(e.getMessage());
        }
    }
    public Squadra getSquadra() {
        return squadra;
    }
}
