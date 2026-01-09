package Scuola;

public abstract class Persona {
    private String nome,cognome,id;
    public Persona(String nome, String cognome,String id){
        if(nome==null||cognome==null||id==null)throw new IllegalArgumentException();
        if(id.length()!=6)throw new IllegalArgumentException();
        if(!id.matches("^\\d{3}\\w{3}"))throw new IllegalArgumentException();
        this.nome=nome;
        this.cognome=cognome;
        this.id=id;
    }
    public String getNome() {
        return nome;
    }
    public String getCognome() {
        return cognome;
    }
    public String getId() {
        return id;
    }
    public int hashCode() {
        return id.hashCode();
    }
    }

