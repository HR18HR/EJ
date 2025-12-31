package generatore;

public class NuclearPowerPlant extends GeneratoreElettrico{
    private int kwh;
    public NuclearPowerPlant(int kwh) {
        super();
        this.kwh = kwh;
    }
    public void  setKwh(int kwh) {
        this.kwh = kwh;
    }

    @Override
    public int getKwh(DateHour data) {
        return kwh;
    }

}
