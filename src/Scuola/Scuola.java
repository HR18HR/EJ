package Scuola;

import java.util.HashSet;

public class Scuola {
    private HashSet<Classe>classi;
    public Scuola(HashSet<Classe> classi) {
        if(classi==null || classi.isEmpty())throw new IllegalArgumentException();
        this.classi = classi;
    }
    public HashSet<Classe> getClassi() {
        HashSet<Classe> classi_1 = new HashSet<Classe>();
        return classi_1.addAll(classi)?classi_1:null;

    }
}
