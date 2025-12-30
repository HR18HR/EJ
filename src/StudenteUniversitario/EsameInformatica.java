package StudenteUniversitario;

public class EsameInformatica implements Esame{
    int matricola,Voto;

    public EsameInformatica(int matricola,int es_1,int es_2,int es_3){
        if(Integer.valueOf(matricola).toString().length()<6)throw new IllegalArgumentException();
        this.matricola=matricola;
        this.Voto=(es_1+es_2+es_3);
    }
    @Override
    public int getMatricola() {
        return matricola;
    }
    @Override
    public int getPunteggio() {
        return Voto;
    }
    @Override
    public int hashCode() {
        return matricola+Voto;
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj)return true;
        if(obj instanceof EsameInformatica){
            EsameInformatica e = (EsameInformatica) obj;
            return matricola==e.matricola && Voto==e.Voto;
        }
        return false;
    }

}
