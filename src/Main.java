import Giochi.*;

import java.util.ArrayList;

public class Main  {



    public static  void main(String[] args)throws Exception {
        ArrayList<Nazione> nazioni=new ArrayList<Nazione>();
       Nazione Italia=new Nazione("Italia","2006");
        Italia.setNumeroMedaglie(TipoMedaglia.Oro,28);
        Nazione Moria=new Nazione("Moria","2006");
        Moria.setNumeroMedaglie(TipoMedaglia.Bronzo,20);
        Nazione Brasileiro=new Nazione("Brasileiro","2006");
        Brasileiro.setNumeroMedaglie(TipoMedaglia.Oro,25);
        Nazione Marocco=new Nazione("Marocco","2006");
        Marocco.setNumeroMedaglie(TipoMedaglia.Argento,10);
        nazioni.add(Italia);
        nazioni.add(Moria);
        nazioni.add(Brasileiro);
        nazioni.add(Marocco);
        MedagliereOlimpico m=new MedagliereOlimpico(nazioni,"2006");
        for(Nazione n:m.getNazioni()){
            System.out.println(n.getNazione());
        }

    }

            }


