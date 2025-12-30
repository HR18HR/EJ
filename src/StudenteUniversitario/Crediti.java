package StudenteUniversitario;

import java.io.Serializable;

public class Crediti implements Esame {
    int matricola,crediti;
    public Crediti(int matricola, int crediti) {
        if(Integer.valueOf(matricola).toString().length()<6)throw new IllegalArgumentException();
        this.matricola = matricola;
        this.crediti = crediti;
    }
    @Override
    public int getMatricola() {
        return matricola;
    }
    @Override
    public int getPunteggio(){
        return crediti;
    }
    @Override
    public int hashCode() {
        return matricola+crediti;
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj)return true;
        if(obj instanceof Crediti){
            Crediti e = (Crediti) obj;
            return matricola==e.matricola && crediti==e.crediti;
        }
        return false;
    }


}
