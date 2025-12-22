package eserci2;

public class Biglietto {
    protected String codice;
    public Biglietto(String codice) {
        if (codice.matches("^[A-Z]{2}\\d{6}$")) {
            this.codice = codice;
        }
        else throw new IllegalArgumentException("Codice invalido");
    }

    @Override
    public int hashCode() {
        return codice.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        if(obj==this) return true;
        if(obj instanceof Biglietto){
            Biglietto b = (Biglietto)obj;
            return this.codice.equals(b.codice);
        }
        return false;
    }
}
