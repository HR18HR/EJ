package Evento;

import javax.print.DocFlavor;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Evento {
    String Nome;
    Date Data;
    int NumeroPartecipanti;
    HashSet<String> partecipanti=new HashSet<String>();
    public  Evento(String Nome, Date Data, int NumeroPartecipanti, HashSet<String> partecipanti) {
        if(NumeroPartecipanti<0)throw new IllegalArgumentException();
        this.Nome = Nome;
        this.Data = Data;
        this.NumeroPartecipanti = NumeroPartecipanti;
        this.partecipanti = partecipanti;
    }

    public boolean isPieno(){
        return partecipanti.size()<NumeroPartecipanti;
    }

}
