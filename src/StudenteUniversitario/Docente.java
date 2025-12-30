package StudenteUniversitario;

import java.util.HashSet;

public class Docente {
    HashSet<Esame>esami=new HashSet<>();

    public Docente(HashSet<Esame>esami) {
        this.esami=esami;
    }

     public Studente getEsamiStudente(int matricola){
        EsameInformatica ef=null;
        EsameMatematica efm=null;
        EsameFisica fisica=null;
        Crediti C=null;
        for(Esame e:esami){
            if(e instanceof EsameInformatica&&(e.getMatricola()==matricola))ef=(EsameInformatica)e;
            if(e instanceof EsameMatematica&&(e.getMatricola()==matricola))efm=(EsameMatematica)e;
            if(e instanceof EsameFisica&&(e.getMatricola()==matricola))fisica=(EsameFisica)e;
            if (e instanceof Crediti&&(e.getMatricola()==matricola))C=(Crediti) e;
        }
         if(ef==null||efm==null||fisica==null||C==null)return null;
         else return new Studente(" "," ",matricola,C.getPunteggio(),ef.getPunteggio(),efm.getPunteggio(),fisica.getPunteggio());
     }
}
