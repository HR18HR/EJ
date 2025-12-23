package Maturita;

import java.sql.Struct;

public final class Maturita {
    String Cf;
    int Crediti,prima,seconda,colloquio;
    public Maturita(String Cf, int Crediti, int prima, int seconda, int colloquio) {
        if(Cf==null)throw new MaturitaException("Cf nullo");
        this.Cf = Cf;
        this.Crediti = Crediti;
        this.prima = prima;
        this.seconda = seconda;
        this.colloquio = colloquio;
    }
    public int getVoti(){
        return this.prima+this.seconda+this.colloquio;
    }

}
