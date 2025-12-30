package SistemaBanca;

public class Deposito implements Transazioni {
   float Importo;
   String Contocorrente;
   public Deposito(float Importo,String Contocorrente){
       this.Importo=Math.abs(Importo);
       this.Contocorrente=Contocorrente;
   }
   @Override
    public float getImporto() {
        return Importo;
    }
    @Override
    public String getContocorrente() {
        return Contocorrente;
    }

}
