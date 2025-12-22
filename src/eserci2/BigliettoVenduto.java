package eserci2;

import java.util.Date;

public class BigliettoVenduto extends Biglietto {
    String luogo;
    Date dataVenduto;
    public BigliettoVenduto(String codice, String luogo, Date dataVenduto) {
        super(codice);
        this.luogo = luogo;
        this.dataVenduto = dataVenduto;
    }
    @Override
    public int hashCode() {
        return codice.hashCode()+dataVenduto.hashCode()+luogo.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
       if(obj==this) return true;
        if(obj instanceof BigliettoVenduto){
            BigliettoVenduto b = (BigliettoVenduto) obj;
            return (this.luogo.equals(b.luogo)&&this.dataVenduto.equals(b.dataVenduto)&&this.codice.equals(b.codice));
        }
        return false;
    }
}
