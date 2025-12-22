package eserci2;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Lotteria {
    Set<BigliettoVenduto> set = new HashSet<BigliettoVenduto>();
    public BigliettoVenduto getVenduto(Biglietto biglietto, String luogo , Date data){
        if(biglietto==null) throw new IllegalArgumentException("La venduta esta vazia");
        if(luogo==null) throw new IllegalArgumentException("Luogo esta vazia");
        if(data==null) throw new IllegalArgumentException("La data esta vazia");
        //if(set.size()<) return null;
        BigliettoVenduto bv=new BigliettoVenduto(biglietto.codice,luogo,data);
        set.add(bv);
        return bv;
    }

    public BigliettoVenduto[] getBigleitti(){
        BigliettoVenduto[]bv=new BigliettoVenduto[5];
        int i=0;
        for(BigliettoVenduto bvv:set){
            if(i==5) break;
            bv[i++]=bvv;
            set.remove(bvv);
        }
        return bv;
    }



}
