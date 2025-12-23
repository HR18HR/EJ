package Match;

public abstract class  Match {
    protected  String Sq1,Sq2;

    public Match(String Sq1,String Sq2) {
        this.Sq1=Sq1;
        this.Sq2=Sq2;
    }

    public abstract  String Getvincitore();

    public String getSq1() {
        return Sq1;
    }
   public String getSq2() {
        return Sq2;
   }

}
