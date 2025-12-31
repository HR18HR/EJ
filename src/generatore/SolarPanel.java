package generatore;

public class SolarPanel extends GeneratoreElettrico{
        private int kwh;
    public SolarPanel(int kwh) {
        super();
        this.kwh = kwh;
    }

    @Override
    public int getKwh(DateHour data) {
        if((data.getMese()<=9||data.getMese()>=4)&&(data.getOra()<=20||data.getOra()>=6))return kwh;
        else return 0;
    }

}
