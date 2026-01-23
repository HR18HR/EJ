package Match;

public class SoccerMatch  extends Match {
    private final int gsq1,gsq2;
    public SoccerMatch(String sq1,String sq2,int gsq1,int gsq2){
        super(sq1,sq2);
        if(gsq1 <0 || gsq2 <0)throw new IllegalArgumentException();
        this.gsq1=gsq1;
        this.gsq2=gsq2;
    }
    @Override
    public  String getVincitore() {
        int c=Integer.compare(this.getgsq1(),this.getgsq2());
        if(c==-1)return this.getSq2();
        if(c==1)return this.getSq1();
        else return null;
    }
    public int getgsq1(){
        return gsq1;
    }
    public int getgsq2(){
        return gsq2;
    }

}
