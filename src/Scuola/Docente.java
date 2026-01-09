package Scuola;

public class Docente extends Persona{
    private String Materia;
    Docente(String nome, String cognome, String id,String Materia){
        super(nome,cognome,id);
        if(Materia==null)throw new IllegalArgumentException();
        this.Materia=Materia;
    }
    public String getMateria() {
        return Materia;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj==this)return true;
        if(obj instanceof Docente){
            Docente d=(Docente)obj;
            return this.getId().equals(d.getId());
        }
        return false;
    }
}
