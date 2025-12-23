package Nazione;

public class Nazione implements Comparable<Nazione>{
    public final String nome;
    public final String edizione;
    private int oro;
    private int argento;
    private int bronzo;
    public enum Medaglia {
        oro("Oro"),argento("Argento"),bronzo("Bronzo");
        private String tipo;
        Medaglia(String tipo) {
            this.tipo = tipo;
        }
        public String gettipo() {
            return tipo;
        }

    }
    public Nazione(String nome, String edizione) throws OlympicException {
        if(nome == null || edizione == null) throw new OlympicException("Errore");
        this.nome = nome;
        this.edizione = edizione;
        oro=0;
        argento=0;
        bronzo= 0;
    }
    public void setMedalgia(Medaglia medalgia,int valore) {
        if(medalgia==null) throw new OlympicException("Errore");
        if(medalgia.gettipo().equals("Oro"))oro+=valore;
        if(medalgia.gettipo().equals("Argento"))argento+=valore;
        else bronzo+=valore;
    }
    public int getOro() {
        return oro;
    }
    public int getargento() {
        return argento;
    }
    public int getbronzo() {
        return bronzo;
    }
    @Override
    public int compareTo(Nazione o) {
        if(Integer.compare(getOro(),o.getOro())!=0)return Integer.compare(o.getOro(),getOro());
        else if(Integer.compare(getargento(),o.getargento())!=0)return Integer.compare(o.getargento(),getargento());
        else return Integer.compare(o.getbronzo(),getbronzo());
    }

}
