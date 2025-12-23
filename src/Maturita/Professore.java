package Maturita;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Professore {
    LinkedHashSet<Prova> coll;
    public Professore(LinkedHashSet<Prova>coll) {
        this.coll = coll;
    }
    public Maturita getMaturita(String cf) {
        ArrayList<Prova> arraylist = new ArrayList<Prova>();
        for (Prova p : coll) {
            if(p.getCf().equals(cf))arraylist.add(p);
        }
        if(arraylist.size()<4) return null;
        Maturita m=new Maturita(cf,0,0,0,0);
        for(Prova p: arraylist){
            if(p instanceof SecondaProva)m.seconda=p.getPunti();
            else if (p instanceof CreditiFormativi)m.Crediti=p.getPunti();
            else if (p instanceof PrimaProva)m.prima=p.getPunti();
            else if( p instanceof TerzaProva) m.colloquio=p.getPunti();
        }
        return m;
    }
}
