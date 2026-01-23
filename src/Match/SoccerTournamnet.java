package Match;

import java.util.HashSet;

public class SoccerTournamnet {
    HashSet<String> teams;
    HashSet<Match> matches;
    public SoccerTournamnet(HashSet<String> teams, HashSet<Match> matches){
        if(teams==null || matches==null)throw new NullPointerException("teams and matches cannot be null");
        for(Match m:matches){
            if( !(m instanceof SoccerMatch))throw new RuntimeException("SoccerMatch class must implement SoccerMatch");
            if(!(teams.contains(m.getSq1())&&teams.contains(m.getSq2())))throw new RuntimeException("SoccerMatch class must implement SoccerMatch");
        }
        this.teams = teams;
        this.matches = matches;
    }


    public int getPoints(String sq){
            int punti=0;
            for(Match m:matches){
                SoccerMatch sm = (SoccerMatch)m;
                if(sm.getSq1().equals(sq)||sm.getSq2().equals(sq)){
                    if(sm.getVincitore().equals(sq))punti+=3;
                    if(sm.getVincitore()==null)punti+=1;
                }
            }
            return punti;
    }

}
