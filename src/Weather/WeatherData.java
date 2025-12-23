package Weather;

import java.util.Date;

public class WeatherData {
    private float min,max,pioggia;
    private int velocitavento;
    private String Localita;
    private Date data;
    public WeatherData(float min,float max,float pioggia,int velocitavento,String Localita,Date data)throws WeatherValueException{
        if(min>max)throw new WeatherValueException("Minimune valeur");
        if(Localita==null)throw new WeatherValueException("Localita non valide");
        if(data==null)throw new WeatherValueException("Data non valide");
        this.min=min;
        this.max=max;
        this.velocitavento=velocitavento;
        this.Localita=Localita;
        this.data=data;
        this.pioggia=pioggia;
    }
    public float getMin() {
        return min;
    }
    public float getMax() {
        return max;
    }
    public float getPioggia() {
        return pioggia;
    }
    public int getVelocitavento() {
        return velocitavento;
    }
    public String getLocalita() {
        return Localita;
    }
    public Date getData() {
        return data;
    }

}
