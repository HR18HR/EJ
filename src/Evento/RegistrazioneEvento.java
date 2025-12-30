package Evento;

import java.io.Serializable;

public class RegistrazioneEvento implements Registrazione{

    String Partecipante;
    String NomeEvento;

    public RegistrazioneEvento(String Partecipante,String NomeEvento) {
        this.Partecipante=Partecipante;
        this.NomeEvento=NomeEvento;
    }

    @Override
    public String getPartecipante() {
        return Partecipante;

    }

    @Override
    public String getEvento() {
        return NomeEvento;
    }
}
