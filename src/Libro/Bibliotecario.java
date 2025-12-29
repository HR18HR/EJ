package Libro;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Bibliotecario {
    ArrayList<Prestito> prestiti;
    public Bibliotecario(ArrayList<Prestito> prestiti) {
        if(prestiti==null)throw new NullPointerException("La lista esta vacia");
        this.prestiti=prestiti;
    }
    public LinkedHashSet<String> getLettori(String Isbn) {
        LinkedHashSet<String>Lettori=new LinkedHashSet<>();
        for(Prestito p:prestiti){
            if(p.Isbn().equals(Isbn))Lettori.add(p.Nomelettore());
        }
        return (Lettori.isEmpty())?null:Lettori;
    }
}
