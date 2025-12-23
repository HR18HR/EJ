package Maturita;

public class SecondaProva implements Prova {
    String cf;
    int punti;
    public SecondaProva(String cf,int punti_1,int punti_2,int punti_3) {
        this.cf = cf;
        this.punti=punti_1+punti_2+punti_3;
    }
    @Override
    public String getCf() {
        return cf;
    }
    @Override
    public int getPunti() {
        return punti;
    }

}
