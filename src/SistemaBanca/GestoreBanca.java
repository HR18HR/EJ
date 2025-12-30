package SistemaBanca;

import java.util.ArrayList;

public class GestoreBanca {
    ArrayList<Transazioni>cc=new ArrayList<>();
    public GestoreBanca(ArrayList<Transazioni> cc) {
        this.cc=cc;
    }

    public float getSaldoContoCorrente(String ContoCorrente) {
        float saldo=0;
        for(Transazioni t:cc){
            if( (t instanceof Deposito)&&(t.getContocorrente().equals(ContoCorrente)))saldo+=t.getImporto();
            if((t instanceof Prelievo)&&(t.getContocorrente().equals(ContoCorrente)))saldo-=t.getImporto();
        }
        return saldo;
    }
}
