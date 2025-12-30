package SistemaBanca;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public final class ContoCorrente {
    String NumeroConto,Intestatario;
    float Saldo;
    ArrayList<Transazioni> transazioni=new ArrayList<Transazioni>();

    public ContoCorrente(String NumeroConto, String Intestatario, float Saldo) {
        this.NumeroConto = NumeroConto;
        this.Intestatario = Intestatario;
        this.Saldo = Saldo;
    }
    public float getSaldo(){
        for(Transazioni t:transazioni) {
            if (t instanceof Deposito) Saldo += t.getImporto();
            if(t instanceof Prelievo) Saldo -= t.getImporto();
        }
        return Saldo;
    }

    public void agggiungiTransazioni(Transazioni transazione){
        if(transazione==null)throw new NullPointerException("Transazione nula");
       if(transazione.getContocorrente().equals(this.NumeroConto))transazioni.add(transazione);
       else throw new RuntimeException("ContoCorrente non valido ");
    }



}
