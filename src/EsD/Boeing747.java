package EsD;

import java.util.Date;

public class Boeing747 extends Airplane{


    public Boeing747() {
        super();
    }
     public Date PartenzaV()throws Exception{
        if(!this.airplanes.get(0).getOraP().before(new Date())) throw new Exception();
        Date d=this.airplanes.getFirst().getOraA();
        airplanes.removeFirst();
        return d;


     }
}
