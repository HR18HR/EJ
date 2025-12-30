package StudenteUniversitario;

public class EsameFisica extends EsameInformatica{
    public EsameFisica(int matricola,int es_1,int es_2,int es_3) {
        super(matricola,es_1,es_2,es_3);
    }
    @Override
    public int hashCode() {
        return matricola+Voto;
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj)return true;
        if(obj instanceof EsameFisica){
            EsameFisica e = (EsameFisica) obj;
            return matricola==e.matricola && Voto==e.Voto;
        }
        return false;
    }
}
