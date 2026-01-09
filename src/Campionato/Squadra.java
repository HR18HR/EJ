package Campionato;

import java.util.HashSet;

public class Squadra {
    String id,nome,ColoriMaglia;
    HashSet<Giocatore>giocatori;
    public Squadra(String id, String nome, String ColoriMaglia)throws EccezzioneC{
        if(id==null||nome==null||
                ColoriMaglia==null||
                ColoriMaglia.contains("/")==false||
                ColoriMaglia.split("/").length!=2){
            throw new EccezzioneC("Valori non corretti ");
        }
        this.id=id;
        this.nome=nome;
        this.ColoriMaglia=ColoriMaglia;

    }

    public String getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getColoriMaglia() {
            return ColoriMaglia;
    }
     public void SetGiocatori (HashSet<Giocatore> giocatori)throws EccezzioneC{
        if(giocatori==null||giocatori.isEmpty())throw new EccezzioneC("Rosa Nulla");
        this.giocatori=giocatori;
     }

    public Giocatore getGiocatore(String id ){
        for(Giocatore g:giocatori){
            if(g.getId().equals(id))return g;
        }
        return null;
    }
    public HashSet<Giocatore> getGiocatori()throws EccezzioneC{
        HashSet<Giocatore>giocatori_1=new HashSet<>();
        for(Giocatore g:giocatori){
            giocatori_1.add(new Giocatore(g.getNome(),g.getCognome(),g.getId(),new Squadra(this.id,this.nome,this.ColoriMaglia)));
        }
        return giocatori_1;
    }
    public boolean RemoveGiocatore(String id){
        for(Giocatore g:giocatori){
            if(g.getId().equals(id)){giocatori.remove(g);return true;}
        }
        return false;

    }

}
