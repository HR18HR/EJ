package Giochi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class MedagliereOlimpico implements Medagliere {
    private ArrayList<Nazione> nazioni = new ArrayList<Nazione>();
    public MedagliereOlimpico(Collection<Nazione> nazioni,String anno) {
        for (Nazione n : nazioni) {
            if (n.getEdizioone().equals(anno)) this.nazioni.add(n);
        }
        this.nazioni.sort((e1,e2)->{

            return  Nazione.compare(e2,e1);
        });
    }
        @Override
        public Nazione getPrima(){
            return nazioni.toArray(new Nazione [0])[0];
        }
        @Override
        public Nazione getSeconda(){
        return nazioni.toArray(new Nazione [0])[1];
    }
    @Override
        public Nazione getTerza(){
        return nazioni.toArray(new Nazione [0])[2];
    }

    public ArrayList<Nazione> getNazioni() {
        ArrayList<Nazione> nazion = new ArrayList<>();
        nazion.addAll(nazioni);
        return nazion;
    }
}
