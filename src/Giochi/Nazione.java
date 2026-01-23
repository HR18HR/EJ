package Giochi;

import java.util.Comparator;

public class Nazione  {
    private String Nazione,Edizioone;
    private int Mo,Ma,Mb;
    public Nazione(String Nazione, String Edizioone)throws OlympicException {
        if(Nazione==null || Edizioone==null) throw new OlympicException("Valori nulli");
        this.Nazione = Nazione;
        this.Edizioone = Edizioone;
        Mo=Ma=Mb=0;
    }

    public String getNazione() {
        return Nazione;
    }
    public String getEdizioone() {
        return Edizioone;
    }
    public int getMo() {
        return Mo;
    }
    public int getMb() {
        return Mb;
    }
    public int getMa() {
        return Ma;
    }

    @Me(value=0)
    public void setNumeroMedaglie(TipoMedaglia m ,int numero){
        if(m==TipoMedaglia.Oro)Mo+=numero;
        if(m==TipoMedaglia.Bronzo)Mb+=numero;
        if(m==TipoMedaglia.Argento)Ma+=numero;
    }

    static public int compare(Nazione o,Nazione n) {
        int cmp=Integer.compare(o.getMo(),n.getMo());
        if(cmp!=0) return cmp;
        cmp=Integer.compare(o.getMa(),n.getMa());
        if(cmp!=0) return cmp;
        return Integer.compare(o.getMb(),n.getMb());


    }


}
