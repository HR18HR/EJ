package Maturita;

public class CreditiFormativi implements Prova {
    private int totale;
    private String cf;
    public CreditiFormativi(int totale, String cf) {
        this.totale = totale;
        this.cf = cf;
    }
    @Override
    public String getCf() {
        return cf;
    }
    @Override
    public int getPunti() {
        return totale;
    }
}
