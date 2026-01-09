package Scuola;

public class Alunno extends Persona{
    public Alunno(String nome, String cognome,String id) {
        super(nome,cognome,id);
    }
    @Override
    public boolean equals(Object obj) {
        if(this==obj)return true;
        if(obj instanceof Alunno){
            Alunno a=(Alunno)obj;
            return this.getId().equals(a.getId());
        }
        return false;
    }
}
