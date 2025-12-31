package generatore;
public class DateHour{
    private int Ora,Giorno,Mese;
    public DateHour(int Ora, int Giorno, int Mese) {
        if(Ora<0||Ora>24||Giorno<1||Giorno>31||Mese<1||Mese>12)throw new IllegalArgumentException();
        this.Ora = Ora;
        this.Giorno = Giorno;
        this.Mese = Mese;
    }
    public int getOra() {
        return Ora;
    }
    public int getGiorno() {
        return Giorno;
    }
    public int getMese() {
        return Mese;
    }
}
