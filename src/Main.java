import eserci2.Biglietto;
import esercizio.uno.Nazione;
import prova.array.Arraylist;
import esercizio.uno.MedagliereOlimpico;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Creazione delle nazioni
        Nazione usa = new Nazione("USA", "2024");
        Nazione ita = new Nazione("Italia", "2024");
        Nazione ger = new Nazione("Germania", "2024");

        // Assegno le medaglie
        usa.setMedalgia(Nazione.Medaglia.oro, 10);
        usa.setMedalgia(Nazione.Medaglia.argento, 5);
        usa.setMedalgia(Nazione.Medaglia.bronzo, 2);

        ita.setMedalgia(Nazione.Medaglia.oro, 8);
        ita.setMedalgia(Nazione.Medaglia.argento, 7);
        ita.setMedalgia(Nazione.Medaglia.bronzo, 5);

        ger.setMedalgia(Nazione.Medaglia.oro, 12);
        ger.setMedalgia(Nazione.Medaglia.argento, 4);
        ger.setMedalgia(Nazione.Medaglia.bronzo, 3);

        // Inserisco in TreeSet (ordinato automaticamente)
        TreeSet<Nazione> medagliere = new TreeSet<>();
        medagliere.add(usa);
        medagliere.add(ita);
        medagliere.add(ger);


        MedagliereOlimpico k=new MedagliereOlimpico(medagliere,"2024");
        System.out.println(k.getPrimo().nome);

    }
}