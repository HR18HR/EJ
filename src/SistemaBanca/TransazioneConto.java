package SistemaBanca;

public class TransazioneConto implements Transazioni{
    String ContoCorrente;
    float Importo;
    public TransazioneConto(String ContoCorrente, float Importo){
        this.ContoCorrente = ContoCorrente;
        this.Importo = Importo;
    }
    @Override
    public String getContocorrente(){
        return ContoCorrente;
    }
    @Override
    public float getImporto(){
        return Importo;
    }

}
