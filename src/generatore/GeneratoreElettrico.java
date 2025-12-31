package generatore;

import java.util.Date;

public abstract class  GeneratoreElettrico {
    public abstract int getKwh(DateHour data);
    public int getProducedKwh(DateHour data ,DateHour data2) {
        int kwh =0;
        int ora=data.getOra(),giorno=data.getGiorno();
        for(;giorno!= data2.getGiorno();++giorno){
            for(;ora<24;++ora){
                kwh+=getKwh(new DateHour(ora,giorno,data2.getMese()));
            }
            ora=0;
        }
        for(int i= data2.getOra();i<24;++i){
            kwh+=getKwh(new DateHour(i,ora,data2.getMese()));
        }
        return kwh;
    }
}
