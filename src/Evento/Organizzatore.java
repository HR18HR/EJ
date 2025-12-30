package Evento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Organizzatore {
    ArrayList<Registrazione> registrazioni;
    public Organizzatore(ArrayList<Registrazione> registrazioni){
        this.registrazioni=registrazioni;
    }

    public HashSet<String> getRegistrazioni(String NomeEvento){
        HashSet<String>Partecipante=new HashSet<>();
        for(Registrazione registrazione: registrazioni){
            if(registrazione.getEvento().equals(NomeEvento))Partecipante.add(registrazione.getPartecipante());
        }
        return (Partecipante.isEmpty())?null:Partecipante;

    }
}
