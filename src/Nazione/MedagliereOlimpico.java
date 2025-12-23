package Nazione;

import java.util.TreeSet;

public class MedagliereOlimpico implements Medagliere {
    TreeSet<Nazione> nazioni=new TreeSet<>();
    public MedagliereOlimpico(TreeSet<Nazione> nazioni_1,String anno) {
        for(Nazione n:nazioni_1){
            if(n.edizione.equals(anno)){
                this.nazioni.add(n);
            }
        }

    }



    @Override
    public Nazione getPrimo() {
        if(this.nazioni.size()==0)return null;
       return this.nazioni.toArray(new Nazione[0])[0];


    }
    @Override
    public Nazione getSecondo(){
        if(this.nazioni.size()<2)return null;
        return this.nazioni.toArray(new Nazione[0])[1];
    }
    @Override
    public Nazione getTerzo(){
        if(this.nazioni.size()<3)return null;
        return this.nazioni.toArray(new Nazione[0])[2];
    }


}
