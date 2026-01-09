package Scuola;

import java.util.HashSet;

public class Classe {
    private String id_classe;
    private HashSet<Alunno> alunni;
    private HashSet<Docente> docenti;
    public Classe(String id_classe,HashSet<Alunno> alunni, HashSet<Docente> docenti) {
        if(id_classe==null||alunni==null||docenti==null||alunni.isEmpty()||docenti.isEmpty())throw new IllegalArgumentException();
        this.id_classe=id_classe;
        this.alunni=alunni;
        this.docenti=docenti;
    }
    public String getId_classe() {
        return id_classe;
    }
    public Alunno [] getAlunni() {
        return alunni.toArray(new Alunno[0]);
    }
    public Docente [] getDocenti() {
        return docenti.toArray(new Docente[0]);
    }
    public Alunno getAlunno(String id){
        for(Alunno alunno:alunni){
            if(alunno.getId().equals(id))return new Alunno(alunno.getNome(),alunno.getCognome(),alunno.getId());
        }
        return null;
    }
    public Docente getDocente(String id){
        for(Docente docente:docenti){
            if(docente.getId().equals(id))return new Docente(docente.getNome(), docente.getCognome(), docente.getId(),docente.getMateria());
        }
        return null;
    }

    @Override
    public int hashCode() {
        return id_classe.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        if(obj==this)return true;
        if(obj instanceof Classe){
            Classe classe = (Classe) obj;
            if(this.id_classe.equals(classe.id_classe))return true;
            else{
                boolean ret=false;
                for(Alunno alunno:alunni){
                    ret=classe.alunni.contains(alunno);
                }
                return ret;
            }
        }
        return false;
    }
}
