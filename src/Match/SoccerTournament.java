package Match;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class SoccerTournament {
   LinkedHashSet<String> Squadre=new LinkedHashSet<>();
   LinkedHashSet<Match> partite=new LinkedHashSet<>();
   public SoccerTournament(LinkedHashSet<String> Squadre,LinkedHashSet<Match> partite)throws Exception{
       if(Squadre==null||partite==null)throw new Exception();
       this.Squadre=Squadre;
       this.partite=partite;
       for(Match partita:partite){
           if(!(partita instanceof SoccerMatch&&Squadre.contains(partita.Sq1)&&Squadre.contains(partita.Sq2)))throw new Exception();

       }


   }
   public int GetPoints(String squadra){
       int punt=0;
       for(Match partita:partite){
           partita=(SoccerMatch)partita;
           if(partita.Getvincitore().equals(squadra))punt+=3;
           if(partita.Getvincitore()==null&&partita.Sq1.equals(squadra)||partita.Sq2.equals(squadra))punt+=1;
       }

       return punt;
   }



}
