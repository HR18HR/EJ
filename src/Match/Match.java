package Match;

public abstract class Match {
    private final String sq1,sq2;

    public Match(String sq1,String sq2){
        if(sq1==null || sq2==null)throw new NullPointerException("sq1 and sq2 can't be null");
        this.sq1 = sq1;
        this.sq2 = sq2;
    }
    public String getSq1(){
        return this.sq1;
    }
    public String getSq2(){
        return this.sq2;
    }

    protected abstract String getVincitore();
}
