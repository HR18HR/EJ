package EsD;

import java.util.Date;

public class Flight {
    private String CittaP,CittaA;
    private int id;
    private Date OraP,OraA;

    public Flight(String CittaP,String CittaA,int id , Date OraA,Date OraP)throws Exception{
        if(CittaP==null||CittaA==null)throw new Exception("CittaP or CittaA is null");
        if(id<0 || id>99999)throw new Exception("Flight id out of range");
        if(!OraP.before(OraA))throw new Exception("OraA not before OraP");
        this.CittaP=CittaP;
        this.CittaA=CittaA;
        this.id=id;
        this.OraP=OraP;
    }
    public String getCittaP() {
        return CittaP;
    }
    public String getCittaA() {
        return CittaA;
    }
    public int getId() {
            return id;
    }
    public Date getOraP() {
        return OraP;
    }
    public Date getOraA() {
        return OraA;
    }

}
