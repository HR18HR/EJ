package Match;

public class SoccerMatch extends Match{
    int Gsq1,Gsq2;
    public SoccerMatch(String Sq1,String Sq2,int Gsq1,int Gsq2){
        if(Sq1==null||Sq2==null)throw new RuntimeException();
        this.Sq1=Sq1;
        this.Sq2=Sq2;
        this.Gsq1=Gsq1;
        this.Gsq2=Gsq2;
    }

    @Override
    public String Getvincitore(){
        if(Integer.compare(Gsq1,Gsq2)<0)return Sq2;
        if(Integer.compare(Gsq1,Gsq2)>0)return Sq1;
        else return null;
    }
}
